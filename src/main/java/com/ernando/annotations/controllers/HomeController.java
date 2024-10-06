package com.ernando.annotations.controllers;

import com.ernando.annotations.logs.MyLog;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {

    @GetMapping("/")
    @MyLog
    public ResponseEntity<Void> home() {
        System.out.println("Home controller");
        return ResponseEntity.ok().build();
    }
}
