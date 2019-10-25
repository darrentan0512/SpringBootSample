package com.dbs.hackathon.service;

import com.dbs.hackathon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    private int count = 0;

    @Scheduled(cron="* * * * * *")
    public void printSomething(){
        System.out.println(count++);
    }


    @PostConstruct
    public void printSystem(){
        System.out.println("System starting");
    }

}
