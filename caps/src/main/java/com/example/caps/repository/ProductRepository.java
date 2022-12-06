package com.example.caps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.caps.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
