package com.codeline.Polling_Application_API.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Getter
@Setter
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;

    @ElementCollection
    private List<String> choices;

    // Constructors, getters, and setters

    // Methods for calculating the poll results
    public PollResult getPollResult() {
        // Calculate the results based on votes and return a PollResult object
        // Implement your logic here
        return new PollResult(this);
    }
}