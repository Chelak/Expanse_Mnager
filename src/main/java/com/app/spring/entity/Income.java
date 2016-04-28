package com.app.spring.entity;

import javax.persistence.*;

/**
 * Created by scelac on 4/6/16.
 */
@Entity
@Table(name="Income")
public class Income
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "income_id")
    private Integer income_ID;
    @Column(name="income_title")
    private String incomeTitle;
    @Column(name="income_description")
    private String incomeDescription;
    @ManyToOne
    @JoinColumn(name="categoryID")
    private IncomeCategory incomeCategory;
    @OneToOne
    @PrimaryKeyJoinColumn
    private Transaction transaction;

    public Integer getIncome_ID() {
        return income_ID;
    }

    public void setIncome_ID(Integer income_ID) {
        this.income_ID = income_ID;
    }

    public String getIncomeTitle() {
        return incomeTitle;
    }

    public void setIncomeTitle(String incomeTitle) {
        this.incomeTitle = incomeTitle;
    }

    public String getIncomeDescription() {
        return incomeDescription;
    }

    public void setIncomeDescription(String incomeDescription) {
        this.incomeDescription = incomeDescription;
    }

    public IncomeCategory getIncomeCategory() {
        return incomeCategory;
    }

    public void setIncomeCategory(IncomeCategory incomeCategory) {
        this.incomeCategory = incomeCategory;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
