package com.teksystems.springmvcdemo.repositories;

import com.teksystems.springmvcdemo.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
