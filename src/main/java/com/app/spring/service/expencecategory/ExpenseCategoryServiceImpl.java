package com.app.spring.service.expencecategory;

import com.app.spring.dao.expenseCategory.ExpenseCategoryDAO;
import com.app.spring.entity.ExpenseCategory;
import com.app.spring.service.expense.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by scelac on 4/11/16.
 */
@Service("ExpenseCategoryServiceImpl")
public class ExpenseCategoryServiceImpl implements ExpenseCategoryService {

    @Autowired
    ExpenseCategoryDAO expenseCategoryDAO;

    @Transactional
    @Override
    public void addExpenseCategory(ExpenseCategory expenseCategory) {
        expenseCategoryDAO.addExpenseCategory(expenseCategory);
    }
    @Transactional
    @Override
    public ExpenseCategory getById(Integer id) {
        return expenseCategoryDAO.getById(id);
    }
    @Transactional
    @Override
    public List<ExpenseCategory> getAll() {
        return expenseCategoryDAO.getAll();
    }
    @Transactional
    @Override
    public void editCategory(ExpenseCategory expenseCategory, Integer id) {
        expenseCategoryDAO.editCategory(expenseCategory,id);
    }
    @Transactional
    @Override
    public void removeCategory(Integer Id) {
        expenseCategoryDAO.removeCategory(Id);
    }
}
