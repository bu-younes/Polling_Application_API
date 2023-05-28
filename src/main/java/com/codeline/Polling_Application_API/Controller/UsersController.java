package com.codeline.Polling_Application_API.Controller;

import com.codeline.Polling_Application_API.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("users")
public class UsersController {
    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/createUsers")
    public String createUser(@RequestParam String username, @RequestParam String password) {
        userService.createUser(username, password);
        return "Users Created Successfully";
    }
}