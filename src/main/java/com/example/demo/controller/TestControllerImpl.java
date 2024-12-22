package com.example.demo.controller;

import com.example.demo.dto.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("test-bean/{id}")
    public Test testParameters(@PathVariable Long id) { // id should be same
        Test test = new Test();
        test.setMessage(String.format("Test id:%d", id));
        return test;
    }
}
