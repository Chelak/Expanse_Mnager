package com.app.spring.service.transaction;

import com.app.spring.entity.Transaction;

import java.util.List;

/**
 * Created by scelac on 4/11/16.
 */
public interface TransactionService
{
    public void addTransaction(Transaction transaction);
    public Transaction findById(Integer id);
    public List<Transaction> getAll();
}
