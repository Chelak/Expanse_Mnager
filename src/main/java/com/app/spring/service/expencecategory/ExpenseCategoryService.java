package com.app.spring.service.expencecategory;

import com.app.spring.entity.ExpenseCategory;

import java.util.List;

/**
 * Created by scelac on 4/11/16.
 */
public interface ExpenseCategoryService
{
    public void addExpenseCategory(ExpenseCategory expenseCategory);
    public ExpenseCategory getById(Integer id);
    public List<ExpenseCategory> getAll();
    public void editCategory(ExpenseCategory expenseCategory, Integer id);
    public void removeCategory(Integer Id);
}
