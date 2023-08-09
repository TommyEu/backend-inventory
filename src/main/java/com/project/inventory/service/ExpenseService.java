package com.project.inventory.service;

import com.project.inventory.model.Expense;
import com.project.inventory.model.Income;
import com.project.inventory.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    ExpenseRepository expenseRepository;

    public void saveExpense(Expense expense){
        expenseRepository.save(expense);
    }
    public void deleteExpense(Integer id){
        expenseRepository.deleteById(id);
    }
    public List<Expense> getAllExpenses(){
        return expenseRepository.findAll();
    }
}
