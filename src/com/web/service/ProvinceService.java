package com.web.service;

import com.web.dao.ProvinceDao;
import com.web.domain.Province;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Taeyeon-Serenity on 2017/7/23.
 */
public class ProvinceService {
    public List<Province> findAll() throws SQLException {
        return new ProvinceDao().findAll();
    }
}
