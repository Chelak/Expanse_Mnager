package com.app.spring.dao.transaction;

import com.app.spring.entity.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by scelac on 4/11/16.
 */
@Repository
public class TransactionDaoImpl implements TransactionDAO {


    @Autowired
    SessionFactory sessionFactory; // session factory object

    public TransactionDaoImpl() {
    }

    public TransactionDaoImpl(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    private Session getCurrentSession()
    {
        return sessionFactory.getCurrentSession();
    }


    @Override
    public void addTransaction(Transaction transaction) {
        getCurrentSession().save(transaction);
    }

    @Override
    public Transaction findById(Integer id) {
        return (Transaction)getCurrentSession().get(Transaction.class,id);
    }

    @Override
    public List<Transaction> getAll() {
        return  getCurrentSession().createQuery("from Transaction").list();
    }
}
