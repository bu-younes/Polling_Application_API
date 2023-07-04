package com.codeline.Polling_Application_API.Service;

import com.codeline.Polling_Application_API.Models.Poll;
import com.codeline.Polling_Application_API.Repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PollService {

    @Autowired
    private PollRepository pollRepository;

    public Poll createPoll(Poll poll) {
        return pollRepository.save(poll);
    }
}
