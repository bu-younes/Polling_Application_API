package com.codeline.Polling_Application_API.Controller;

import com.codeline.Polling_Application_API.Entity.Poll;
import com.codeline.Polling_Application_API.Repository.PollRepository;
import com.codeline.Polling_Application_API.RequestObjects.PollCreationRequest;
import com.codeline.Polling_Application_API.RequestObjects.PollVoteRequest;
import com.codeline.Polling_Application_API.ResponseObjects.PollResponse;
import com.codeline.Polling_Application_API.ResponseObjects.PollResultsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/polls")
public class PollController {
    private final PollRepository pollRepository;

    @Autowired
    public PollController(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    @PostMapping
    public ResponseEntity<PollResponse> createPoll(@RequestBody PollCreationRequest request) {
        Poll poll = new Poll();
        poll.setQuestion(request.getQuestion());
        poll.setChoices(request.getChoices());
        Poll savedPoll = pollRepository.save(poll);

        PollResponse response = new PollResponse(savedPoll.getId(), savedPoll.getQuestion(), savedPoll.getChoices());
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/{pollId}/vote")
    public ResponseEntity<?> voteOnPoll(@PathVariable Long pollId, @RequestBody PollVoteRequest request) {
        // Implement your logic to handle voting on a poll
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{pollId}")
    public ResponseEntity<PollResultsResponse> getPollResults(@PathVariable Long pollId) {
        // Implement your logic to retrieve the poll results
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{pollId}")
    public ResponseEntity<PollResponse> updatePoll(@PathVariable Long pollId, @RequestBody PollCreationRequest request) {
        // Implement your logic to update a poll
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{pollId}")
    public ResponseEntity<?> deletePoll(@PathVariable Long pollId) {
        // Implement your logic to delete a poll
        return ResponseEntity.ok().build();
    }
}