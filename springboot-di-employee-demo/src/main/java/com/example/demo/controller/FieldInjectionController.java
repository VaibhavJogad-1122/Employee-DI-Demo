package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class FieldInjectionController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/field")
    public Employee getEmployee() {
        return employeeService.getEmployee();
    }
}
