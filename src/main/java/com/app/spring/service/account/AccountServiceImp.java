package com.app.spring.service.account;

import com.app.spring.dao.account.AccountDAO;
import com.app.spring.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by scelac on 4/8/16.
 */
@Service("accountServiceImp")
public class AccountServiceImp implements AccountService
{
    @Autowired
    AccountDAO accountDAO;



    @Override
    @Transactional
    public void addAccount(Account account) {
        accountDAO.addAccount(account);
    }

    @Override
    @Transactional
    public Account getAccountById(Integer id) {
        return accountDAO.getAccountById(id);
    }

    @Override
    @Transactional
    public List<Account> getAllAccounts() {
        return accountDAO.getAllAccounts();
    }

    @Override
    @Transactional
    public void updateAccount(Account account, Integer id) {
        accountDAO.updateAccount(account,id);
    }

    @Override
    @Transactional
    public void removeAccount(Integer id)
    {
        accountDAO.removeAccount(id);
    }
}
