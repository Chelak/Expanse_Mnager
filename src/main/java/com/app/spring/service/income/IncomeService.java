package com.app.spring.service.income;

import com.app.spring.entity.Income;

import java.util.List;

/**
 * Created by scelac on 4/11/16.
 */
public interface IncomeService
{
    public void addIncome(Income income);
    public Income getByID(Integer id);
    public List<Income> getAllIncome();
}
