package com.codeline.Polling_Application_API.RequestObjects;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.List;

@Entity
@Getter
@Setter
public class PollCreationRequest {
    private String question;
    private List<String> choices;

    // Constructors, getters, and setters
}
