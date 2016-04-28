package com.app.spring.dao.transaction;

import com.app.spring.entity.Transaction;


import java.util.List;

/**
 * Created by scelac on 4/6/16.
 */
public interface TransactionDAO
{
    public void addTransaction(Transaction transaction);
    public Transaction findById(Integer id);
    public List<Transaction> getAll();
}
