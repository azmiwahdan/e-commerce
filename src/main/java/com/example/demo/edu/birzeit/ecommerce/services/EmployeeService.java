package com.example.demo.edu.birzeit.ecommerce.services;

import com.example.demo.edu.birzeit.ecommerce.models.Employee;
import com.example.demo.edu.birzeit.ecommerce.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeService {

    @Autowired
     private EmployeeRepository employeeRepository;


    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee findEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


    public Employee updateEmployee(Employee employee) {
        Employee e = findEmployeeById(employee.getEmployee_Id());

        if (Objects.isNull(e)){
            return null;
        }
        return employeeRepository.save(employee);
    }
}
