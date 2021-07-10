package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.User;
import com.example.demo.model.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/get/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/post/enroll")
    public User enrollUser(@RequestBody User user) {
        System.out.println(user);
        return userRepository.save(user);
    }

    @DeleteMapping("/delete/comment")
    public String deleteComment(@RequestParam(value="id") String id) {
        System.out.println(id);
        userRepository.deleteById(id);
        return "삭제 성공";
    }

}
