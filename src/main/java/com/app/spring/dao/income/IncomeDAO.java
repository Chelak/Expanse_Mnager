package com.app.spring.dao.income;

import com.app.spring.entity.Income;

import java.util.List;

/**
 * Created by scelac on 4/6/16.
 */
public interface IncomeDAO
{
    public void addIncome(Income income);
    public Income getByID(Integer id);
    public List<Income> getAllIncome();

}
