package com.app.spring.service.incomecategory;

import com.app.spring.entity.IncomeCategory;

import java.util.List;

/**
 * Created by scelac on 4/11/16.
 */
public interface IncomeCategoryService
{
    public void addIncomeCategory(IncomeCategory incomeCategory);
    public IncomeCategory getById(Integer id);
    public List<IncomeCategory> getAll();
    public void editCategory(IncomeCategory  incomeCategory, Integer id);
    public void removeCategory(Integer Id);
}
