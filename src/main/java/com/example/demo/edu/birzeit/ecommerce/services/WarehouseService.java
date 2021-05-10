
package com.example.demo.edu.birzeit.ecommerce.services;

import com.example.demo.edu.birzeit.ecommerce.models.Warehouse;
import com.example.demo.edu.birzeit.ecommerce.repositories.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class WarehouseService {


    @Autowired
    private WarehouseRepository warehouseRepository;

    public List<Warehouse> getWarehouses() {
        return warehouseRepository.findAll();
    }

    public Warehouse findWarehouseById(int id) {
        return warehouseRepository.findById(id).orElse(null);
    }

    public Warehouse addWarehouse(Warehouse order) {
        return warehouseRepository.save(order);
    }

    public Warehouse updateWarehouse(Warehouse warehouse) {
        Warehouse e = findWarehouseById(warehouse.getWarehouse_Id());

        if (Objects.isNull(e)){
            return null;
        }
        return warehouseRepository.save(warehouse);
    }
}
