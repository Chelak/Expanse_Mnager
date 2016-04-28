package com.app.spring.dao.incomeCategory;

import com.app.spring.entity.IncomeCategory;

import java.util.List;

/**
 * Created by scelac on 4/6/16.
 */
public interface IncomeCategoryDAO
{
    public void addIncomeCategory(IncomeCategory incomeCategory);
    public IncomeCategory getById(Integer id);
    public List<IncomeCategory> getAll();
    public void editCategory(IncomeCategory  incomeCategory, Integer id);
    public void removeCategory(Integer Id);
}
