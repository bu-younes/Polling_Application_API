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

import java.util.List;

@RestController
@RequestMapping("/api/polls")
public class PollController {

    // Existing createPoll method
    @PostMapping
    public ResponseEntity<?> createPoll(@RequestBody PollCreationRequest request) {
        // Implementation
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    // New method for creating a poll with a different request mapping
    @PostMapping("/another")
    public ResponseEntity<?> createAnotherPoll(@RequestBody PollCreationRequest request) {
        // Implementation
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}