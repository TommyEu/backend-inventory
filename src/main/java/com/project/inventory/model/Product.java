package com.project.inventory.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "incomes")
    private Integer incomes;

    @Column(name = "expenses")
    private Integer expenses;

    @Column(name = "stock")
    private Integer stock;

    @OneToMany(mappedBy = "product")
    private List<Expense> expensesList;

    @OneToMany(mappedBy = "product")
    private List<Income> incomesList;

    public Product() {
    }

    public Product(Long id, String sku, String name, Integer incomes, Integer expenses, Integer stock, List<Expense> expensesList, List<Income> incomesList) {
        this.id = id;
        this.sku = sku;
        this.name = name;
        this.incomes = incomes;
        this.expenses = expenses;
        this.stock = stock;
        this.expensesList = expensesList;
        this.incomesList = incomesList;
    }
}
