package com.project.inventory.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "expense")
public class Expense extends Movement {
    @Id
    @Column(name = "expense_id", nullable = false)
    private Long expenseId;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "sku", insertable = false, updatable = false)
    private Product product;

    @Override
    public void processMovement(Integer amount) {
        this.product.setExpenses(product.getExpenses()+amount);
    }

    // Otros atributos, constructores, getters y setters
}

