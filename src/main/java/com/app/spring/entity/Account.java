package com.app.spring.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by scelac on 4/8/16.
 */
@Entity
@Table(name="Account")
public class Account
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "account_ID")
    private Integer accountId;
    @Column(name="account_title")
    private String acountTitle;
    @ManyToOne
    @JoinColumn(name="user_ID")
    private User user;
    @Column(name = "balance")
    private Float balance;
    @OneToMany(mappedBy = "account",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Transaction> transactions = new ArrayList<>();




    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAcountTitle() {
        return acountTitle;
    }

    public void setAcountTitle(String acountTitle) {
        this.acountTitle = acountTitle;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
