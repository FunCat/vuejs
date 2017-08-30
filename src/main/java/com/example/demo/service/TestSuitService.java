package com.example.demo.service;

import com.example.demo.entity.TestSuit;
import com.example.demo.repository.TestSuitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestSuitService {

    @Autowired
    TestSuitRepository testSuitRepository;

    public List<TestSuit> getTestSuits(){
        return testSuitRepository.findAll();
    }

    public void addTestSuit(TestSuit testSuit) {
        testSuitRepository.save(testSuit);
    }

    public TestSuit getTestSuit(String name) {
        return testSuitRepository.findByName(name);
    }
}
