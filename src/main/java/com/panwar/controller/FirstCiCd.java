package com.panwar.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/welcome")
public class FirstCiCd {

    @GetMapping
    public ResponseEntity<String> welcome(){
        return ResponseEntity.ok("This is my demo");

    }
}
