package com.devmarquinhos.eletroshop_api.controller;

import com.devmarquinhos.eletroshop_api.model.Product;
import com.devmarquinhos.eletroshop_api.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id){
        return service.findById(id);
    }
    
    @PostMapping
    public ResponseEntity<Product> create(@Valid @RequestBody Product product){
        Product savedProduct = service.save(product);
        return ResponseEntity.status(201).body(savedProduct); 
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable Long id, @Valid @RequestBody Product product){
        Product updatedProduct = service.update(id, product);
        return ResponseEntity.ok(updatedProduct);
    }
}
