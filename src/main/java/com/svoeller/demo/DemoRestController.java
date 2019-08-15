package com.svoeller.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/example")
public class DemoRestController {
    @GetMapping(produces = "application/json")
    public String get() {
        return "{\"hello\":\"world\"}";
    }
}
