package com.app.spring.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by scelac on 4/6/16.
 */
@Entity
@Table(name="Expense_Category")
public class ExpenseCategory
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "category_ID")
    private Integer categoryId;
    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "category_description")
    private String categoryDescription;
    @ManyToOne
    @JoinColumn(name="user_ID")
    private User user;
    @OneToMany(mappedBy = "expenseCategory",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Expense> expenses = new ArrayList<>();



    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }


    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }
}
