package com.codeline.Polling_Application_API.Service;



import com.codeline.Polling_Application_API.Models.Users;
import com.codeline.Polling_Application_API.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<Users> getUsers() {return userRepository.findAll();
    }
    public void saveUsers(Users users) {userRepository.save(users); }
}
