package com.gcp.alloy.demo.Alloy.db.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    private Long id;
    private String name;
    private String email;

    // Getters and Setters
}
