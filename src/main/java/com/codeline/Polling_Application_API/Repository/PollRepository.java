package com.codeline.Polling_Application_API.Repository;

import com.codeline.Polling_Application_API.Entity.Poll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollRepository extends JpaRepository<Poll, Long> {
}
