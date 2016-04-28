package com.app.spring.dao.expenseCategory;

import com.app.spring.entity.ExpenseCategory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by scelac on 4/11/16.
 */
@Repository
public class ExpenseCategoryDaoImpl implements ExpenseCategoryDAO {

    @Autowired
    SessionFactory sessionFactory; // session factory object

    public ExpenseCategoryDaoImpl() {
    }


    public ExpenseCategoryDaoImpl (SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }

    private Session getCurrentSession()
    {
        return sessionFactory.getCurrentSession();
    }
    @Override
    public void addExpenseCategory(ExpenseCategory expenseCategory) {
        getCurrentSession().save(expenseCategory);
    }

    @Override
    public ExpenseCategory getById(Integer id) {
        return (ExpenseCategory) getCurrentSession().get(ExpenseCategory.class, id);
    }

    @Override
    public List<ExpenseCategory> getAll() {
        return getCurrentSession().createQuery("from Expense_Category").list();
    }

    @Override
    public void editCategory(ExpenseCategory expenseCategory, Integer id) {
        ExpenseCategory categorytoedit = getById(id);
        if (categorytoedit != null)
        {
            categorytoedit.setCategoryDescription(expenseCategory.getCategoryDescription());
            categorytoedit.setCategoryName(expenseCategory.getCategoryName());
            getCurrentSession().update(categorytoedit);
        }
    }

    @Override
    public void removeCategory(Integer Id) {
        ExpenseCategory categoryTORemove = getById(Id);

        if (categoryTORemove !=null)
        {
            getCurrentSession().delete(categoryTORemove);
        }
    }
}
