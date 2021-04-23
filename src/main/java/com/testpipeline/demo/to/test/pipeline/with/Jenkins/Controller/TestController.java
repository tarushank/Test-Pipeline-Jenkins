package com.testpipeline.demo.to.test.pipeline.with.Jenkins.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/jenkins")
    public String display() {
        System.out.println("Testing Jenkins");
        return "Testing Jenkins";
    }
}
