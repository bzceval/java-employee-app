package com.busrademir.employee_app.service;

import com.busrademir.employee_app.model.Employee;
import com.busrademir.employee_app.model.UpdateEmployee;
import com.busrademir.employee_app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeeList() {
        return employeeRepository.getAllEmployeeList();
    }

    public Employee getEmployeeById(String id){
        return employeeRepository.getEmployeeById(id);
    }

    public List<Employee> getEmployeeWithParams(String firstName, String lastName) {
        return employeeRepository.getEmployeeWithParams(firstName, lastName);
    }

    public Employee saveEmployee(Employee newEmployee) {
        return employeeRepository.saveEmployee(newEmployee);
    }

    public boolean deleteEmployee(String id) {
        return employeeRepository.deleteEmployee(id);
    }

    public Employee updateEmployee(String id, UpdateEmployee request) {
        return employeeRepository.updateEmployee(id, request);
    }
}
