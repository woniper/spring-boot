package net.woniper.springboot.controller;

import net.woniper.springboot.domain.User;
import net.woniper.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by woniper on 14. 10. 25..
 */
@Controller
@RequestMapping("/")
public class MainController {

    @Autowired private UserRepository userRepository;

    @RequestMapping
    public @ResponseBody String index() {
        return "Hello Woniper Spring Boot~";
    }

    @RequestMapping("/users")
    public @ResponseBody List<User> getUserList() {
        return userRepository.findAll();
    }

    @RequestMapping("/velocity")
    public String velocity() {
        return "index";
    }
}
