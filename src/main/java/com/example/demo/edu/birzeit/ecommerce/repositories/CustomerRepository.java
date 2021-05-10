package com.example.demo.edu.birzeit.ecommerce.repositories;


import com.example.demo.edu.birzeit.ecommerce.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
