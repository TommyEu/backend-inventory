package com.project.inventory.service;

import com.project.inventory.model.Income;
import com.project.inventory.repository.IncomeRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IncomeService {
    @Autowired
    IncomeRepository incomeRepository;

    public void saveIncome(Income income){
        incomeRepository.save(income);
    }
    public void deleteIncome(Integer id){
        incomeRepository.deleteById(id);
    }
    public List<Income> getAllIncomes(){
        return incomeRepository.findAll();
    }
}
