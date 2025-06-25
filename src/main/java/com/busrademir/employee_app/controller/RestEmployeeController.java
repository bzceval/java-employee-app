package com.busrademir.employee_app.controller;


import com.busrademir.employee_app.model.Employee;
import com.busrademir.employee_app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/v1/api")

public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee-list")
    public List<Employee> getAllEmployeeList() {
        return employeeService.getAllEmployeeList();
    }

}
