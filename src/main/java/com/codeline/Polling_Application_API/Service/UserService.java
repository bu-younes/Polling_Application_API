package com.codeline.Polling_Application_API.Service;


import com.codeline.Polling_Application_API.Models.Users;
import com.codeline.Polling_Application_API.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(String username, String password) {
        Users user = new Users();
        user.setUsername(username);
        user.setPassword(password);
        userRepository.save(user);
    }
}
