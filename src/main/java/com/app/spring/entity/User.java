package com.app.spring.entity;

import javax.faces.bean.ManagedBean;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by scelac on 4/8/16.
 */
@ManagedBean
@Entity
@Table(name="User")
public class User
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer id;
    @Column(name="user_first_name")
    private String firstName;
    @Column(name="user_last_name")
    private String lastName;
    @Column(name="user_email")
    private String email;
    @Column(name="user_password")
    private String password;
    @OneToMany(mappedBy = "user", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Role> roles = new ArrayList<>();
    @OneToMany(mappedBy = "user", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Account> accounts = new ArrayList<>();
    @OneToMany(mappedBy = "user", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private List<ExpenseCategory> expenseCategories = new ArrayList<>();
    @OneToMany(mappedBy = "user", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private List<IncomeCategory> incomeCategories = new ArrayList<>();

    public List<ExpenseCategory> getExpenseCategories() {
        return expenseCategories;
    }

    public void setExpenseCategories(List<ExpenseCategory> expenseCategories) {
        this.expenseCategories = expenseCategories;
    }
    public List<IncomeCategory> getIncomeCategories() {
        return incomeCategories;
    }

    public void setIncomeCategories(List<IncomeCategory> incomeCategories) {
        this.incomeCategories = incomeCategories;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
