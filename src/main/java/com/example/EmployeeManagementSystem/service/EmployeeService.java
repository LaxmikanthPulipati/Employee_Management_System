package com.example.EmployeeManagementSystem.service;

import java.util.List;
import java.util.Optional;
import com.example.EmployeeManagementSystem.model.Employee;
import com.example.EmployeeManagementSystem.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements EmployeeRepository {

        @Autowired
        private EmployeeJpaRepository employeeRepository;

        @Override
        public List<Employee> getAllEmployees() {
            return employeeRepository.findAll();
        }

        @Override
        public void saveEmployee(Employee employee) {
            this.employeeRepository.save(employee);
        }

        @Override
        public Employee getEmployeeById(long id) {
            Optional<Employee> optional = employeeRepository.findById(id);
            Employee employee = null;
            if (optional.isPresent()) {
                employee = optional.get();
            } else {
                throw new RuntimeException(" Employee not found for id :: " + id);
            }
            return employee;
        }

        @Override
        public void deleteEmployeeById(long id) {
            this.employeeRepository.deleteById(id);
        }
}

