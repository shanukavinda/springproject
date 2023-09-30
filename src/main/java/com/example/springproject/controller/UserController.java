package com.example.springproject.controller;

import com.example.springproject.dto.UserDto;
import com.example.springproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/users")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser(){
        return "This is the get user function.";
    }

    @PostMapping("/saveUser")
    public UserDto saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }

    @PutMapping("/updateUser")
    public String updateUser(){
        return "This is the update user function.";
    }

    @DeleteMapping ("/deleteUser")
    public String deleteUser(){
        return "This is the delete user function.";
    }
}
