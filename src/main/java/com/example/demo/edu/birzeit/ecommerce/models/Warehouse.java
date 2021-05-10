package com.example.demo.edu.birzeit.ecommerce.models;

import lombok.*;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Entity

public class Warehouse {
    @Id
    @GeneratedValue
    private int warehouse_Id;
    private String location;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Employee> employees = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Product> products = new HashSet<>();
}
