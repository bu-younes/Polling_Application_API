package com.codeline.Polling_Application_API.Controller;


import com.codeline.Polling_Application_API.Models.Users;
import com.codeline.Polling_Application_API.RequestObjects.GetUsersRequestObject;
import com.codeline.Polling_Application_API.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class UsersController {


    @Autowired
    UserService userService;


    @RequestMapping("/api/register")
    public void saveUsers(@RequestBody GetUsersRequestObject usersRequestObject) {
        createUsers(usersRequestObject);
    }

    @RequestMapping("get/register")
    public List<Users> getUsers() {
        return userService.getUsers();
    }






    public void createUsers(GetUsersRequestObject usersRequestObject) {

        Users users = new Users();

        users.setUsername(usersRequestObject.getUsername());
        users.setPassword(usersRequestObject.getPassword());
        users.setUpdatedDate(new Date());
        users.setCreatedDate(new Date());
        users.setIsActive(true);
        userService.saveUsers(users);

    }

}