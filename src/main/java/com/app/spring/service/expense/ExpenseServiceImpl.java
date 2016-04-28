package com.app.spring.service.expense;

import com.app.spring.dao.expanse.ExpenseDAO;
import com.app.spring.entity.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by scelac on 4/11/16.
 */
@Service("ExpenseServiceImpl")
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    ExpenseDAO expenseDAO;
    @Override
    @Transactional
    public void addExpense(Expense expense) {
        expenseDAO.addExpense(expense);
    }

    @Override
    @Transactional
    public Expense getExpenseById(Integer id) {
        return expenseDAO.getExpenseById(id);
    }

    @Override
    @Transactional
    public List<Expense> getAllExpense() {
        return expenseDAO.getAllExpense();
    }
}
