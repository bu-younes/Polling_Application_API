package com.codeline.Polling_Application_API.ResponseObjects;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import java.util.List;
@EntityScan(basePackages = {"com.codeline.Polling_Application_API.Entity", "other.package.to.scan"})
@Getter
@Setter
public class PollResponse {
    private Long id;
    private String question;
    private List<String> choices;

    public PollResponse() {
    }

    public PollResponse(Long id, String question, List<String> choices) {
        this.id = id;
        this.question = question;
        this.choices = choices;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getChoices() {
        return choices;
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }
}