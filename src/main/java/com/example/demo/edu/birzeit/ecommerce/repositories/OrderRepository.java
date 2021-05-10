package com.example.demo.edu.birzeit.ecommerce.repositories;

import com.example.demo.edu.birzeit.ecommerce.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Orders,Integer> {
}
