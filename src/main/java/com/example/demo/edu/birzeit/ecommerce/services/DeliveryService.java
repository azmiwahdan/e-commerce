package com.example.demo.edu.birzeit.ecommerce.services;

import com.example.demo.edu.birzeit.ecommerce.models.Delivery;
import com.example.demo.edu.birzeit.ecommerce.repositories.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DeliveryService {

    @Autowired
    DeliveryRepository deliveryRepository;

    public List<Delivery> getDeliveries() {
        return deliveryRepository.findAll();
    }

    public Delivery findDeliveryById(int id) {
        return deliveryRepository.findById(id).orElse(null);
    }

    public Delivery addDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    public Delivery deleteDelivery(int id) {
        return deliveryRepository.findById(id).orElse(null);
    }

    public Delivery updateDelivery(Delivery delivery) {
        Delivery d = findDeliveryById(delivery.getDelivery_Id());

        if (Objects.isNull(d)) {
            return null;
        }
        return deliveryRepository.save(delivery);
    }

}
