package com.asser.asser_demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class WebController {

    @GetMapping("/hi")
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

}
