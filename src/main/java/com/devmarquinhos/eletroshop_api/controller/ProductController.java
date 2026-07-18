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
}
