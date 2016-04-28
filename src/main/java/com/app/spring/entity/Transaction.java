package com.app.spring.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by scelac on 4/6/16.
 */
@Entity
@Table(name="Transaction")
public class Transaction
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "transaction_ID")
    private Integer transactionId;
    @ManyToOne
    @JoinColumn(name="account_ID")
    private Account account;
    @Column(name = "transaction_date")
    private Date date;
    @Column(name = "transaction_description")
    private String description;
    @OneToOne( mappedBy = "transaction", fetch=FetchType.EAGER)
    private Income income;
    @OneToOne(mappedBy = "transaction", fetch=FetchType.EAGER)
    private Expense expense;

    public Income getIncome() {
        return income;
    }

    public void setIncome(Income income) {
        this.income = income;
    }

    public Expense getExpense() {
        return expense;
    }

    public void setExpense(Expense expense) {
        this.expense = expense;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }
}
