package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.Repository.UserRepository;
import com.springboot.model.User;

@Controller
public class Test {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
    	User user = userRepository.findUserById(2);
    	
        return user.getName();
    }

}
