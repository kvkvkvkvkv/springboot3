package com.example.demo.controller;

import com.example.demo.dto.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerImpl implements TestController {

    @Override
    //@RequestMapping(method = RequestMethod.GET, path = "/test")
    @GetMapping("test")
    public String test() {
        return "Hiii";
    }

    @GetMapping("test-bean")
    public Test testBean() {
        Test test = new Test();
        test.setMessage("test");
        return test;
    }
}
