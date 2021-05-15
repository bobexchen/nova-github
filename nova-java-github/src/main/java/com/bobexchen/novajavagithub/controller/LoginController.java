package com.bobexchen.novajavagithub.controller;

import com.bobexchen.novajavagithub.model.PersonInfo;
import com.bobexchen.novajavagithub.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private Logger log = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private LoginService loginService = null;

    @PostMapping("/register")
    public void registerPersonalInfo(@RequestBody PersonInfo personInfo) {
        log.warn("person is {}", personInfo);
        log.warn("person.getNickname() is {}", personInfo.getNickname());
        log.warn("person is {}", personInfo.getAge());
        loginService.registerPersonalInfo(personInfo);
    }

    @GetMapping("/get/agebyname/{nickname}")
    public Integer getAgeByName(@PathVariable String nickname) {
        log.warn("nickname is {}", nickname);
        return loginService.getAgeByName(nickname).getAge();
    }

}
