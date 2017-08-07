package com.web.dao;

import com.web.domain.User;
import com.web.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * Created by Taeyeon-Serenity on 2017/7/22.
 */
public class UserDao {
    public User getUserByUsername4Ajax(String username) throws SQLException {
        QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
        String sql="select * from user where username=? limit 1";
        return qr.query(sql,new BeanHandler<>(User.class),username);
    }
}
