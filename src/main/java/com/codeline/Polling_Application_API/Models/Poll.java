package com.codeline.Polling_Application_API.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;

    @ElementCollection
    private List<String> choices = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "poll_vote_counts", joinColumns = @JoinColumn(name = "poll_id"))
    @MapKeyColumn(name = "choice")
    @Column(name = "vote_count")
    private Map<String, Integer> voteCounts = new HashMap<>();
}
