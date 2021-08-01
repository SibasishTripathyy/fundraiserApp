package com.ngo.fundraiser.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ngo.fundraiser.dto.UserDTO;
import com.ngo.fundraiser.entity.User;
import com.ngo.fundraiser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User saveUser(@RequestBody UserDTO userDTO) {

        return userService.saveUser(userDTO);
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers() {

        return userService.getAllUsers();
    }

}
