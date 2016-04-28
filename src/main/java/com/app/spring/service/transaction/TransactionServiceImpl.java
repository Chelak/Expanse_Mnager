package com.app.spring.service.transaction;

import com.app.spring.dao.transaction.TransactionDAO;
import com.app.spring.entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by scelac on 4/11/16.
 */
@Service("TransactionServiceImpl")
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionDAO transactionDAO;


    @Override
    @Transactional
    public void addTransaction(Transaction transaction) {
        transactionDAO.addTransaction(transaction);
    }

    @Override
    @Transactional
    public Transaction findById(Integer id) {
        return transactionDAO.findById(id);
    }

    @Override
    @Transactional
    public List<Transaction> getAll() {
        return transactionDAO.getAll();
    }
}
