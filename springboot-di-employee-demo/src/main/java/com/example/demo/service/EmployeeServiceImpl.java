package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Employee getEmployee() {

        return new Employee(1, "John", "IT");
    }
}
