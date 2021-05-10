package com.example.demo.edu.birzeit.ecommerce.services;

import com.example.demo.edu.birzeit.ecommerce.models.Customer;
import com.example.demo.edu.birzeit.ecommerce.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Objects;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer findCustomerById(@PathVariable int id) {
        return customerRepository.findById(id).orElse(null);
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer( @PathVariable int id) {
        Customer c = findCustomerById(id);
        if (Objects.isNull(c)) {
            throw new RuntimeException("Customer Not Found!");

        }
        customerRepository.delete(c);
    }

    public Customer updateCustomer(Customer customer) {
        Customer c = findCustomerById(customer.getCustomer_Id());
        if (Objects.isNull(c)) {
            return null;
        }
        return customerRepository.save(customer);
    }

}
