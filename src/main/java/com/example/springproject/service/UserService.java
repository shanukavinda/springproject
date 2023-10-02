package com.example.springproject.service;

import com.example.springproject.dto.UserDto;
import com.example.springproject.entity.User;
import com.example.springproject.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public UserDto saveUser(UserDto userDto){
        userRepo.save(modelMapper.map(userDto, User.class));
        return userDto;
    }

    public List<UserDto> getAllUsers(){
        List<User> usersList = userRepo.findAll();
        return modelMapper.map(usersList, new TypeToken<List<UserDto>>(){}.getType());

    }

    public UserDto updateUser(UserDto userDto){
        userRepo.save(modelMapper.map(userDto, User.class));
        return userDto;
    }

    public boolean deleteUser(UserDto userDto){
        userRepo.delete(modelMapper.map(userDto, User.class));
        return true;
    }

}
