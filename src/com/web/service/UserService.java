package com.web.service;

import com.web.dao.UserDao;
import com.web.domain.User;

import java.sql.SQLException;

/**
 * Created by Taeyeon-Serenity on 2017/7/22.
 */
public class UserService {
    public User checkUsername4Ajax(String username) throws SQLException {
        return new UserDao().getUserByUsername4Ajax(username);
    }
}
