package com.app.spring.dao.income;

import com.app.spring.entity.Income;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by scelac on 4/11/16.
 */
public class IncomeDaoImpl implements IncomeDAO {
    @Autowired
    SessionFactory sessionFactory; // session factory object


    public IncomeDaoImpl(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    private Session getCurrentSession()
    {
        return sessionFactory.getCurrentSession();
    }

    public IncomeDaoImpl() {
    }


    @Override
    public void addIncome(Income income) {
      getCurrentSession().save(income);
    }

    @Override
    public Income getByID(Integer id) {
        return (Income) getCurrentSession().get(Income.class,id);
    }

    @Override
    public List<Income> getAllIncome() {
        return getCurrentSession().createQuery("from Income").list();
    }
}
