package com.example.demo;

import com.example.demo.config.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class MyResource {

    @Autowired
    ConfigProperties configProperties;

    @GetMapping("/test")
    public User getTest1() {
        return User.builder().username("Robbert").email("robbert@example.com").build();
    }

    @GetMapping("config")
    public ConfigProperties getConfig() {
        return configProperties;
    }

    @GetMapping("session")
    public String getSession(HttpSession session) {
        return session.getId();
    }

}
