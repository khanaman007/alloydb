package com.gcp.alloy.demo.Alloy.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcp.alloy.demo.Alloy.db.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

