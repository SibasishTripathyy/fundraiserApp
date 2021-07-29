package com.ngo.fundraiser.controller;

import com.ngo.fundraiser.dto.UserDTO;
import com.ngo.fundraiser.entity.User;
import com.ngo.fundraiser.service.UserService;
import com.ngo.fundraiser.utils.UserUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public UserDTO  saveUser(@RequestBody UserDTO userDTO) {

        return userService.saveUser(userDTO);
    }
    
    @PostMapping("/login")
    public UserDTO  loginUser(@RequestBody UserDTO userDTO) {

        return userService.loginUser(userDTO);
    }

    @GetMapping("/")
    public List<UserDTO> getAllUsers() {

        return userService.getAllUsers();
    }

}