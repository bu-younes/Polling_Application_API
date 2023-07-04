package com.codeline.Polling_Application_API.Repository;

import com.codeline.Polling_Application_API.Models.Poll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollRepository extends JpaRepository<Poll, Long> {
    Poll findById(long id);
}
