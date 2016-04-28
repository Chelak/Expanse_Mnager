package com.app.spring.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by scelac on 4/6/16.
 */
@Entity
@Table(name = "Income_Category")
public class IncomeCategory
{


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "category_ID")
    private Integer categoryID;
    @Column(name = "category_name")
    private String categoryTitle;
    @ManyToOne
    @JoinColumn(name="user_ID")
    private User user;
    @OneToMany(mappedBy = "incomeCategory",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Income> incomes = new ArrayList<>();

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public List<Income> getIncomes() {
        return incomes;
    }

    public void setIncomes(List<Income> incomes) {
        this.incomes = incomes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
