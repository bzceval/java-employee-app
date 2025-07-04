package com.busrademir.employee_app.controller;


import com.busrademir.employee_app.model.Employee;
import com.busrademir.employee_app.model.UpdateEmployee;
import com.busrademir.employee_app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/employee-list/{id}")
    public Employee getEmployeeById(@PathVariable(name = "id", required = true) String id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/employee-list/with-params")
    public List<Employee> getEmployeeWithParams(@RequestParam(name = "firstName", required = false) String firstName,
                                                @RequestParam(name = "lastName", required = false) String lastName) {
        return employeeService.getEmployeeWithParams(firstName, lastName);
    }

    @PostMapping("/save-employee")
    public Employee saveEmployee(@RequestBody Employee newEmployee){
        return employeeService.saveEmployee(newEmployee);
    }

    @DeleteMapping("/delete-employee/{id}")
    public boolean deleteEmployee(@PathVariable(name = "id", required = true) String id) {
        return employeeService.deleteEmployee(id);
    }

    @PutMapping("update-employee/{id}")
    public Employee updateEmployee(@PathVariable(name = "id", required = true) String id,
                                   @RequestBody UpdateEmployee request){
        return employeeService.updateEmployee(id, request);
    }

}
