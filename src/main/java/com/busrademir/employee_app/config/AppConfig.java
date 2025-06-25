package com.busrademir.employee_app.config;

import com.busrademir.employee_app.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1", "Eren", "Demir"));
        employeeList.add(new Employee("2", "Busra", "Demir"));
        employeeList.add(new Employee("3", "Sümeyye", "Yol"));
        employeeList.add(new Employee("4", "Orhan", "Yol"));

        return employeeList;
    }
}
