package com.app.controller;

import com.app.spring.entity.User;
import com.app.spring.service.user.UserService;
import org.springframework.dao.DataAccessException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 * Created by scelac on 4/8/16.
 */
@ManagedBean(name="userController")
@SessionScoped
public class UserController
{
    @ManagedProperty(value="#{UserServiceImpl}")
    UserService userService;
    private User user = new User();

    public UserController() {

    }


    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public boolean validate (String email, String password)
    {
        boolean valid = false;
        user = userService.findByEmail(email);

        if (user != null && user.getPassword().equals(password))
        {
            valid = true;
        }

        return valid;
    }

    public String login()
    {

        boolean valid = validate(user.getEmail(), user.getPassword());

        if (valid)
        {
            HttpSession session = SessionBean.getSession();
            session.setAttribute("username", user.getEmail());
            return "dashboard";
        }else
        {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username and Passowrd", "Please enter correct username and Password"));
            return "login";
        }
    }
    public void userUpdate()
    {

    }
    public String register()
    {
        try {
            User user = new User();
            user.setFirstName(user.getFirstName());
            user.setLastName(user.getLastName());
            user.setEmail(user.getEmail());
            user.setPassword(user.getPassword());
            userService.addUser(user);
            return "login";
        } catch (DataAccessException e) {
            e.printStackTrace();
        }finally {

            return "login";
        }


    }

    public String editUser()
    {
        return "profile";

    }

    public String logout() {
        HttpSession session = SessionBean.getSession();
        session.invalidate();
        return "login";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
