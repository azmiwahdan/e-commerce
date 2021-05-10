package com.example.demo.edu.birzeit.ecommerce.controllers;

import com.example.demo.edu.birzeit.ecommerce.models.Warehouse;
import com.example.demo.edu.birzeit.ecommerce.services.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WarehouseController {
    @Autowired
    private WarehouseService warehouseService;

    @PostMapping("/warehouses")
    public Warehouse addWarehouse(@RequestBody Warehouse warehouse){
        return warehouseService.addWarehouse(warehouse);
    }
    @GetMapping("/warehouses/{id}")
    public Warehouse getWarehouse(@PathVariable int id){
        return warehouseService.findWarehouseById(id);
    }
    @GetMapping("/warehouses")
    public List<Warehouse> getWarehouses(){
        return warehouseService.getWarehouses();
    }
    @PutMapping("/warehouses")
    public Warehouse updateWarehouse(@RequestBody Warehouse warehouse){
        return warehouseService.updateWarehouse(warehouse);
    }

}
