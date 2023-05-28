package com.codeline.Polling_Application_API.Repository;


import com.codeline.Polling_Application_API.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories(basePackages = "com.codeline.PoolingSys")
@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}
