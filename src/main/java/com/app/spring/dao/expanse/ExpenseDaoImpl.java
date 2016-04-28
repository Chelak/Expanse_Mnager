package com.app.spring.dao.expanse;

import com.app.spring.entity.Expense;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by scelac on 4/11/16.
 */
public class ExpenseDaoImpl implements ExpenseDAO {

    @Autowired
    SessionFactory sessionFactory; // session factory object


    public ExpenseDaoImpl(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    private Session getCurrentSession()
    {
        return sessionFactory.getCurrentSession();
    }

    public ExpenseDaoImpl() {
    }

    @Override
    public void addExpense(Expense expense) {
        getCurrentSession().save(expense);
    }

    @Override
    public Expense getExpenseById(Integer id) {
        return (Expense)getCurrentSession().get(Expense.class, id);
    }

    @Override
    public List<Expense> getAllExpense() {
        return getCurrentSession().createQuery("from Expense").list();
    }
}
