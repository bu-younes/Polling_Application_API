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

    @ElementCollection
    @MapKeyColumn(name = "choice")
    @Column(name = "vote_count")
    @CollectionTable(name = "poll_results", joinColumns = @JoinColumn(name = "poll_id"))
    private Map<String, Integer> results = new HashMap<>();


    public Map<String, Integer> getResults() {
        return results;
    }

    public void setResults(Map<String, Integer> results) {
        this.results = results;
    }
}