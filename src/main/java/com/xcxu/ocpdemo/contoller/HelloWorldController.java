package com.xcxu.ocpdemo.contoller;

import com.xcxu.ocpdemo.entity.User;
import com.xcxu.ocpdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String helloWorld() {
        return "hello Springboot OCP-4 xcxu";
    }

    @GetMapping("/list")
    public List<User> list() {
        return userRepository.findAll();
    }

    @PostMapping("/save")
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }
}
