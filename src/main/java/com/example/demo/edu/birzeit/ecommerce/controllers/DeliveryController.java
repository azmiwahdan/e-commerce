package com.example.demo.edu.birzeit.ecommerce.controllers;

import com.example.demo.edu.birzeit.ecommerce.models.Delivery;
import com.example.demo.edu.birzeit.ecommerce.services.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;
    @PostMapping("/deliveries")
    public Delivery addDelivery(@RequestBody Delivery delivery){
        return deliveryService.addDelivery(delivery);
    }
    @GetMapping("/deliveries/{id}")
    public Delivery getDelivery(@PathVariable int id){
        return deliveryService.findDeliveryById(id);
    }

    @GetMapping("/deliveries")
    public List<Delivery> getDeliveries(){
        return deliveryService.getDeliveries();
    }
    @PutMapping("/deliveries")
    public Delivery updateDelivery(@RequestBody Delivery delivery){
        return deliveryService.updateDelivery(delivery);
    }




}
