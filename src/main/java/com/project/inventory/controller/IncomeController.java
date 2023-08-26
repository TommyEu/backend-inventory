package com.project.inventory.controller;

import com.project.inventory.model.Income;
import com.project.inventory.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/incomes")
public class IncomeController {
    @Autowired
    IncomeService incomeService;


    @GetMapping("/all")
    public List<Income> getAllIncomes(){
        return incomeService.getAllIncomes();
    }

    @PostMapping("/save")
    public void saveIncome(Income income){
        incomeService.saveIncome(income);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteIncome(@PathVariable Integer id){
        incomeService.deleteIncome(id);
    }

}
