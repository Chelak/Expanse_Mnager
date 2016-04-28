package com.app.spring.service.user;

import com.app.spring.dao.user.UserDAO;
import com.app.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by scelac on 4/8/16.
 */
@Service("UserServiceImpl")
public class UserServiceImpl implements UserService
{
    @Autowired
    UserDAO userDAO;

    @Override
    @Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    @Transactional
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    @Transactional
    public User findById(Integer userID) {
        return userDAO.findById(userID);
    }

    @Override
    @Transactional
    public User findByEmail(String email) {
        return userDAO.findByEmail(email);
    }

    @Override
    @Transactional
    public void editUser(User user, Integer userID) {
        userDAO.editUser(user,userID);
    }

    @Override
    @Transactional
    public void removeUser(Integer userID) {
        userDAO.removeUser(userID);
    }
}
