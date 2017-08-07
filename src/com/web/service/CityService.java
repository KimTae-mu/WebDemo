package com.web.service;

import com.web.dao.CityDao;
import com.web.domain.City;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Taeyeon-Serenity on 2017/7/23.
 */
public class CityService {
    public List<City> findCitiesByPid(String pid) throws SQLException {
        return new CityDao().findCitiesByPid(pid);
    }
}
