package com.codeline.Polling_Application_API.Entity;


import java.util.HashMap;
import java.util.Map;

public class PollResult {
    private Map<String, Integer> results;

    public PollResult(Poll poll) {
        results = calculateResults(poll);
    }

    private Map<String, Integer> calculateResults(Poll poll) {
        // Implement your logic here to calculate the results
        // You can access the poll choices and votes to calculate the vote count for each choice
        // Return the calculated results as a Map<String, Integer>
        return new HashMap<>();
    }

    public Map<String, Integer> getResults() {
        return results;
    }
}