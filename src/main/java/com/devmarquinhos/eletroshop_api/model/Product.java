package com.devmarquinhos.eletroshop_api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome do produto não pode estar vazio.")
    @Column(nullable = false)
    private String name;

    @NotBlank(message = "Descrição do produto não pode estar nula.")
    @Column(nullable = false)
    private String description;

    @NotBlank(message = "Categoria do produto não pode estar nula.")
    @Column(nullable = false)
    private String category;

    @NotNull(message = "O valor do produto não pode ser nulo.")
    @Min(value = 0, message = "O valor não pode ser negativo.")
    @Column(nullable = false)
    private Double price;

    @NotNull(message = "A quantidade é obrigatória")
    @Min(value = 0, message = "A quantidade de produtos não pode ser negativa")
    @Column(nullable = false)
    private Integer quantity;

    private Boolean isAvailable;

    @PrePersist
    @PreUpdate
    public void calculateStatus(){
        this.isAvailable = this.quantity != null && this.quantity > 0;
    }

}
