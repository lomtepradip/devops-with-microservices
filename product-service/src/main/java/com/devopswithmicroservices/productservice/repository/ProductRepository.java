package com.devopswithmicroservices.productservice.repository;

import com.devopswithmicroservices.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
