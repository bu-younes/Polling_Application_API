package com.codeline.Polling_Application_API.Service;

import com.codeline.Polling_Application_API.Entity.Poll;
import com.codeline.Polling_Application_API.Repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class PollService {
    private final PollRepository pollRepository;

    @Autowired
    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    public Poll createPoll(Poll poll) {
        return pollRepository.save(poll);
    }

    public void voteOnPoll(Long pollId, String choice) {
        Optional<Poll> optionalPoll = pollRepository.findById(pollId);
        if (optionalPoll.isPresent()) {
            Poll poll = optionalPoll.get();
            Map<String, Integer> results = poll.getResults();
            results.put(choice, results.getOrDefault(choice, 0) + 1);
            poll.setResults(results);
            pollRepository.save(poll);
        } else {
            // Handle poll not found exception
        }
    }
//new comments                   
    public Map<String, Integer> getPollResults(Long pollId) {
        Optional<Poll> optionalPoll = pollRepository.findById(pollId);
        if (optionalPoll.isPresent()) {
            Poll poll = optionalPoll.get();
            return poll.getResults();
        } else {
            // Handle poll not found exception
            return new HashMap<>();
        }
    }

    public Poll updatePoll(Long pollId, Poll updatedPoll) {
        Optional<Poll> optionalPoll = pollRepository.findById(pollId);
        if (optionalPoll.isPresent()) {
            Poll poll = optionalPoll.get();
            poll.setQuestion(updatedPoll.getQuestion());
            poll.setChoices(updatedPoll.getChoices());
            return pollRepository.save(poll);
        } else {
            // Handle poll not found exception or return null
            return null;
        }
    }

    public void deletePoll(Long pollId) {
        Optional<Poll> optionalPoll = pollRepository.findById(pollId);
        if (optionalPoll.isPresent()) {
            pollRepository.deleteById(pollId);
        } else {
            // Handle poll not found exception
        }
    }
}