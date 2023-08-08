package com.project.inventory.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;


@Getter @Setter
public abstract class Movement {


    @Column(name = "product_id")
    private String productId;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "date")
    private Date date;

    public abstract void processMovement(Integer amount);

    // Constructores, getters y setters
}

