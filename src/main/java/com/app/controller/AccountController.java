package com.app.controller;

import com.app.spring.entity.User;
import com.app.spring.service.account.AccountService;
import com.app.spring.service.user.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 * Created by scelac on 4/8/16.
 */
@ManagedBean
@SessionScoped
public class AccountController
{
        @ManagedProperty(value="#{UserServiceImpl}")
        UserService userService;
        @ManagedProperty(value = "#{accountServiceImp}")
        AccountService accountService;
        private User user ;
}
