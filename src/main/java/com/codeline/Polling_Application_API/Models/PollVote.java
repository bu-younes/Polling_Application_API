package com.codeline.Polling_Application_API.Models;

public class PollVote {
    private Long pollId;
    private String choice;

    public PollVote() {
    }

    public PollVote(Long pollId, String choice) {
        this.pollId = pollId;
        this.choice = choice;
    }

    public Long getPollId() {
        return pollId;
    }

    public void setPollId(Long pollId) {
        this.pollId = pollId;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }
}