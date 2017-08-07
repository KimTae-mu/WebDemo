package com.web.dao;

import com.web.domain.Province;
import com.web.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.xml.crypto.Data;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Taeyeon-Serenity on 2017/7/23.
 */
public class ProvinceDao {
    public List<Province> findAll() throws SQLException {
        QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
        String sql="select * from province";
        return qr.query(sql,new BeanListHandler<>(Province.class));
    }
}
