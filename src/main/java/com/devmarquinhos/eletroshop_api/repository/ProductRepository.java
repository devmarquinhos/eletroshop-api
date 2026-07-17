package com.devmarquinhos.eletroshop_api.repository;

import com.devmarquinhos.eletroshop_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
