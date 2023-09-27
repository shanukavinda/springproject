package com.example.springproject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/users")
@CrossOrigin
public class UserController {
    @GetMapping("/getUser")
    public String getUser(){
        return "This is the get user function.";
    }

    @PostMapping("/saveUser")
    public String saveUser(){
        return "This is the save user function.";
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
