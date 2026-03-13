package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class ConstructorInjectionController {

    private final EmployeeService employeeService;

    public ConstructorInjectionController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/constructor")
    public Employee getEmployee() {
        return employeeService.getEmployee();
    }
}
