package com.devmarquinhos.eletroshop_api.service;

import com.devmarquinhos.eletroshop_api.model.Product;
import com.devmarquinhos.eletroshop_api.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public Product save(Product product) {
        return repository.save(product);
    }

    public Product update(Long id, Product productData) {
        Product existing = findById(id);

        existing.setName(productData.getName());
        existing.setPrice(productData.getPrice());
        existing.setQuantity(productData.getQuantity());

        return repository.save(existing);
    }

    public void delete(Long id) {
        Product existing = findById(id);

        repository.delete(existing);
    }
}
