package com.app.spring.dao.expanse;

import com.app.spring.entity.Expense;

import java.util.List;

/**
 * Created by scelac on 4/6/16.
 */
public interface ExpenseDAO
{
    public void addExpense(Expense expense);
    public Expense getExpenseById(Integer id);
    public List<Expense> getAllExpense();

}
