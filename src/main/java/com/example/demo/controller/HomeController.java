package com.example.demo.controller;

import com.example.demo.entity.TestSuit;
import com.example.demo.service.TestSuitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    TestSuitService testSuitService;

    @GetMapping(value = "/getTestSuits")
    public List<TestSuit> getTestSuits(){
        return testSuitService.getTestSuits();
    }

    @PostMapping(value="/addTestSuit")
    public String addTestSuit(@RequestBody TestSuit testSuit){
        testSuitService.addTestSuit(testSuit);
        return "Post was published";
    }

    @GetMapping(value = "/getTestSuit/{name}")
    public TestSuit getTestSuit(@PathVariable String name){
        return testSuitService.getTestSuit(name);
    }
}
