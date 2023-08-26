package com.project.inventory.controller;

import com.project.inventory.model.Expense;
import com.project.inventory.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {
    @Autowired
    ExpenseService expenseService;

    @GetMapping("/all")
    public List<Expense> getAllIncomes(){
        return expenseService.getAllExpenses();
    }

    @PostMapping("/save")
    public void saveExpense(Expense expense){
        expenseService.saveExpense(expense);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteExpense(@PathVariable Integer id){
        expenseService.deleteExpense(id);
    }
}
