package com.matos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class MetalFestUserGateway {

    @GetMapping("/{id}")
    public String hello(@PathVariable("id") String id) {
        return "Hello World " + id;
    }
}