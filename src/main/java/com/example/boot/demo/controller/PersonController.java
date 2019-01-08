package com.example.boot.demo.controller;

import com.example.boot.demo.entity.User;
import com.example.boot.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/person")
@EnableAutoConfiguration
public class PersonController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("getPersonById")
    @ResponseBody
    public User getUserById(Long id) {
        User u = userRepository.findById(id);
        System.out.println("userRepository: " + userRepository);
        System.out.println("id: " + id);
        return u;
    }
    @RequestMapping("getUserVoById")
    @ResponseBody
    public User getUserVoById(Long id) {
        User u = userRepository.findById(id);
        System.out.println("userRepository: " + userRepository);
        System.out.println("id: " + id);

        return u;
    }

    @RequestMapping("savePerson")
    @ResponseBody
    public void saveUser() {
        User u = new User();
        u.setName("zz");
        userRepository.save(u);
    }

}
