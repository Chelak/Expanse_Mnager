package com.app.spring.entity;

import javax.persistence.*;

/**
 * Created by scelac on 4/6/16.
 */
@Entity
@Table(name="Expense")
public class Expense
{
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name = "expense_Id")
        private Integer expenseId;
        @ManyToOne
        @JoinColumn(name="category_ID")
        private ExpenseCategory expenseCategory;
        @OneToOne
        @PrimaryKeyJoinColumn
        private Transaction transaction;
        @Column(name = "name")
        private String name;
        @Column(name = "price")
        private Float price;

        public Integer getExpenseId() {
                return expenseId;
        }

        public void setExpenseId(Integer expenseId) {
                this.expenseId = expenseId;
        }

        public ExpenseCategory getExpenseCategory() {
                return expenseCategory;
        }

        public void setExpenseCategory(ExpenseCategory expenseCategory) {
                this.expenseCategory = expenseCategory;
        }

        public Transaction getTransaction() {
                return transaction;
        }

        public void setTransaction(Transaction transaction) {
                this.transaction = transaction;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Float getPrice() {
                return price;
        }

        public void setPrice(Float price) {
                this.price = price;
        }

}
