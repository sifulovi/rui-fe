package com.sio.ruife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping
public class ThymeleftConfigController {

    @GetMapping("/")
    public String renderTamplete() {
        log.info("Rendering thymeleft template");
        return "layouts/container";
    }

    @GetMapping("/userList")
    public String userList() {
        log.info("Rendering thymeleft template for userList");
        return "user/userList";
    }

    @GetMapping(path = "userCreare")
    public String userCreate() {
       return "user/userCreate";
    }
}
