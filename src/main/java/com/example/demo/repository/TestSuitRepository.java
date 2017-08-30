package com.example.demo.repository;

import com.example.demo.entity.TestSuit;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TestSuitRepository extends JpaRepository<TestSuit, Long> {
    TestSuit findByName(String name);
}
