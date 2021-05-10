package com.example.demo.edu.birzeit.ecommerce.controllers;

import com.example.demo.edu.birzeit.ecommerce.models.Customer;
import com.example.demo.edu.birzeit.ecommerce.models.Employee;
import com.example.demo.edu.birzeit.ecommerce.models.Orders;
import com.example.demo.edu.birzeit.ecommerce.models.Product;
import com.example.demo.edu.birzeit.ecommerce.repositories.OrderRepository;
import com.example.demo.edu.birzeit.ecommerce.services.CustomerService;
import com.example.demo.edu.birzeit.ecommerce.services.EmployeeService;
import com.example.demo.edu.birzeit.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    private CustomerService customerService;
    private EmployeeService employeeService;
    private ProductService productService;

    @Autowired
    private OrderRepository orderRepository;


    public OrderController(CustomerService customerService, EmployeeService employeeService, ProductService productService) {
        this.customerService = customerService;
        this.employeeService = employeeService;
        this.productService = productService;
    }

    @GetMapping("/orders")
    public List<Orders> geOrders() {
        return orderRepository.findAll();
    }

    @GetMapping("/orders/{id}")
    public Orders getOrderById(@PathVariable int id) {
        return orderRepository.findById(id).orElse(null);
    }

    @PostMapping("/orders")
    public Orders addOrder(@RequestBody Orders order) {
        Customer customer = customerService.findCustomerById(order.getCustomer_Id());
        Employee employee = employeeService.findEmployeeById(order.getEmployee_Id());
        Product product = productService.findProductById(order.getProduct_Id());

        if (customer == null || employee == null || product == null)
            return null;
        return orderRepository.save(order);


    }
}

