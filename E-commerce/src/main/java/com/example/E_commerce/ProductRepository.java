package com.example.E_commerce;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional query methods can be added here if needed
}
