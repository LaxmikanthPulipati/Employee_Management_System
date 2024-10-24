package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
        List<Employee> getAllEmployees();
        void saveEmployee(Employee employee);
        Employee getEmployeeById(long id);
        void deleteEmployeeById(long id);
}

