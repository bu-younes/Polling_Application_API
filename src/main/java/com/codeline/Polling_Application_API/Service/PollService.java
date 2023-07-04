package com.codeline.Polling_Application_API.Service;

import com.codeline.Polling_Application_API.Models.Poll;
import com.codeline.Polling_Application_API.Repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PollService {

    @Autowired
    private PollRepository pollRepository;

    public Poll createPoll(Poll poll) {
        return pollRepository.save(poll);
    }

    public Poll voteOnPoll(long pollId, String choice) {
        Poll poll = pollRepository.findById(pollId);
        if (poll == null) {
            // Handle poll not found error
            // For simplicity, let's assume we throw a custom exception
            throw new PollNotFoundException("Poll not found with ID: " + pollId);
        }

        Map<String, Integer> voteCounts = poll.getVoteCounts();
        voteCounts.put(choice, voteCounts.getOrDefault(choice, 0) + 1);

        return pollRepository.save(poll);
    }
}
