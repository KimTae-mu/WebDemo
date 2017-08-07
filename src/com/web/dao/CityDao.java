package com.web.dao;

import com.web.domain.City;
import com.web.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Taeyeon-Serenity on 2017/7/23.
 */
public class CityDao {
    public List<City> findCitiesByPid(String pid) throws SQLException {
        QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
        String sql="select * from city where ProvinceID = ?";

        return qr.query(sql,new BeanListHandler<>(City.class),pid);
    }
}
