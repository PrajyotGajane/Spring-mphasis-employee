package com.mphasis.assignmentone.service;

import com.mphasis.assignmentone.model.Employee;
import com.mphasis.assignmentone.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee() {
        return employeeRepository.fetchAllEmployee();
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.saveEmployee(employee);
    }

    public String deleteEmployee(int employeeId) {
        return employeeRepository.deleteEmployee(employeeId);
    }
}
