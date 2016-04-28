package com.app.spring.dao.incomeCategory;

import com.app.spring.entity.IncomeCategory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by scelac on 4/11/16.
 */
public class IncomeCategoryDaoImpl implements IncomeCategoryDAO {

    @Autowired
    SessionFactory sessionFactory; // session factory object


    public IncomeCategoryDaoImpl(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    private Session getCurrentSession()
    {
        return sessionFactory.getCurrentSession();
    }

    public IncomeCategoryDaoImpl() {
    }



    @Override
    public void addIncomeCategory(IncomeCategory incomeCategory) {
        getCurrentSession().save(incomeCategory);
    }

    @Override
    public IncomeCategory getById(Integer id) {
        return (IncomeCategory) getCurrentSession().get(IncomeCategory.class, id);
    }

    @Override
    public List<IncomeCategory> getAll() {
        return getCurrentSession().createQuery("from Income_Category").list();
    }

    @Override
    public void editCategory(IncomeCategory incomeCategory, Integer id) {
            IncomeCategory categoryToEdit = getById(id);
        if (categoryToEdit != null)
        {
            categoryToEdit.setCategoryTitle(incomeCategory.getCategoryTitle());

            getCurrentSession().update(categoryToEdit);
        }
    }

    @Override
    public void removeCategory(Integer Id) {
        IncomeCategory category = getById(Id);
        if (category !=null)
        {
            getCurrentSession().delete(category);
        }

    }
}
