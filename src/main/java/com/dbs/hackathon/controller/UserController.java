package com.dbs.hackathon.controller;

import com.dbs.hackathon.model.User;
import com.dbs.hackathon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hackathon")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/getAll")
    public List getAll(){
        return userRepository.findAll();
    }


    @GetMapping("/id/{id}")
    public String getId(@PathVariable String id){
        Optional<User> optionalUser = userRepository.findById(Integer.parseInt(id));
        if(optionalUser.isPresent()){
            return optionalUser.get().getName();
        }
        return "no user found in database";
    }


}
