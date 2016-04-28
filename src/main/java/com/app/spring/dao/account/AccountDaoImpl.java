package com.app.spring.dao.account;

import com.app.spring.entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by scelac on 4/8/16.
 */
@Repository
public class AccountDaoImpl implements AccountDAO
{
    @Autowired
    SessionFactory sessionFactory; // session factory object

    public AccountDaoImpl() {
    }

    public AccountDaoImpl(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    private Session getCurrentSession()
    {
        return sessionFactory.getCurrentSession();
    }


    @Override
    public void addAccount(Account account) {
        getCurrentSession().save(account);
    }

    @Override
    public Account getAccountById(Integer id) {
//        return (Account) getCurrentSession().createQuery("from Account ac JOIN fetch ac.transactions where ac.account_ID = accId").setParameter("accId",id);
       return (Account) getCurrentSession().get(Account.class,id);
    }

    @Override
    public List<Account> getAllAccounts() {
        return getCurrentSession().createQuery("from Account").list();
    }

    @Override
    public void updateAccount(Account account, Integer id)
    {
        Account accountToEdit = getAccountById(id);
        if (accountToEdit !=null)
        {
            accountToEdit.setAcountTitle(account.getAcountTitle());
            getCurrentSession().update(account);
        }
    }

    @Override
    public void removeAccount(Integer id)
    {
        Account accountToRemove = getAccountById(id);

        if (accountToRemove !=null)
        {
            getCurrentSession().delete(accountToRemove);
        }
    }
}
