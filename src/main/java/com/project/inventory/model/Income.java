package com.project.inventory.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
@Table(name = "income")
public class Income extends Movement {
    @Id
    @Column(name = "id", nullable = false)
    private Long income_id;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "sku", insertable = false, updatable = false)
    private Product product;

    public Income(Product product) {
        this.product = product;
    }

    public Income() {
    }

    @Override
    public void processMovement(Integer amount) {
        product.setExpenses(product.getExpenses() + amount);
    }


}

