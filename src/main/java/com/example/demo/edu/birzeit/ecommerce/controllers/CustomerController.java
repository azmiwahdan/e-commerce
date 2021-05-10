package com.example.demo.edu.birzeit.ecommerce.controllers;

import com.example.demo.edu.birzeit.ecommerce.models.Customer;
import com.example.demo.edu.birzeit.ecommerce.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")

public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer addCustomer( @RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @GetMapping
    public List<Customer>getCustomers(){
        return customerService.getCustomers();
    }
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id){
        return customerService.findCustomerById(id);
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable  int id){
         customerService.deleteCustomer(id);
    }

}
