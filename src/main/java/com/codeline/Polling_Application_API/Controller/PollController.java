package com.codeline.Polling_Application_API.Controller;

import com.codeline.Polling_Application_API.Models.Poll;
import com.codeline.Polling_Application_API.Service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/polls")
public class PollController {

    @Autowired
    private PollService pollService;

    @PostMapping("/{pollId}/vote")
    public ResponseEntity<Poll> voteOnPoll(
            @PathVariable("pollId") long pollId,
            @RequestBody VoteRequest voteRequest
    ) {
        String choice = voteRequest.getChoice();
        Poll votedPoll = pollService.voteOnPoll(pollId, choice);
        return new ResponseEntity<>(votedPoll, HttpStatus.OK);
    }

    // Inner class representing the vote request payload
    public static class VoteRequest {
        private String choice;

        public String getChoice() {
            return choice;
        }

        public void setChoice(String choice) {
            this.choice = choice;
        }
    }
}
