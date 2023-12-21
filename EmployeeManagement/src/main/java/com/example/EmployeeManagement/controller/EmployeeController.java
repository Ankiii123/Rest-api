package com.example.EmployeeManagement.controller;


import com.example.EmployeeManagement.service.EmployeeService;

import com.example.EmployeeManagement.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
EmployeeService employeeService;
    @GetMapping("{id}")
    public Employee getEmployeeDetail(@PathVariable int id){
        return employeeService.getEmployeeDetail(id);
    }

@PostMapping("/")
    public Employee saveDetails(@RequestBody Employee emp){
        return employeeService.saveDetails(emp);
}

@PutMapping("/put")
    public Employee putEmployee(@RequestBody Employee emp){
        return employeeService.putEmployee(emp);
}
}
