package com.app.spring.service.expense;

import com.app.spring.entity.Expense;

import java.util.List;

/**
 * Created by scelac on 4/11/16.
 */

public interface ExpenseService
{
    public void addExpense(Expense expense);
    public Expense getExpenseById(Integer id);
    public List<Expense> getAllExpense();
}
