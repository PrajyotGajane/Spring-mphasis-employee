package com.mphasis.assignmentone.repository;

import com.mphasis.assignmentone.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepository {
    private static HashMap<Integer, Employee> employeeHashMap = new HashMap<Integer, Employee>(){
        {
            put(1, new Employee(1,"Amrut", "Panda", "CEO"));
            put(2, new Employee(2,"Nikhil", "Dhruwe", "CFO"));
            put(3, new Employee(3,"Bhushan", "Dhruwe", "CFO"));
            put(4, new Employee(3,"Prajyot", "Gajane", "Dev"));
        }
    };

    public List<Employee> fetchAllEmployee() {
        List<Employee> employeeList = new ArrayList<>(employeeHashMap.values());
        employeeList.sort((p1, p2) -> -p2.getFirstName().compareTo(p1.getFirstName()));
        return employeeList;
    }

    public Employee saveEmployee(Employee employee) {
        employeeHashMap.put(employee.getEmployeeId(), employee);
        return employee;
    }

    public String deleteEmployee(int employeeId) {
        String message = "Employee Deleted Successfully";
        employeeHashMap.remove(employeeId);
        return message;
    }
}
