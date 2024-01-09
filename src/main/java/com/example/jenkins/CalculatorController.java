package com.example.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        return a + b;
    }

    @GetMapping("/subtract")
    public Integer subtract(@RequestParam Integer a, @RequestParam Integer b) {
        return a - b;
    }

}
