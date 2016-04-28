package com.app.spring.dao.account;

import com.app.spring.entity.Account;


import java.util.List;

/**
 * Created by scelac on 4/8/16.
 */
public interface AccountDAO
{
    public void addAccount(Account account);
    public Account getAccountById(Integer id);
    public List<Account> getAllAccounts();
    public void updateAccount(Account account, Integer id);
    public void removeAccount(Integer id);
}

