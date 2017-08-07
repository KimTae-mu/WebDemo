package com.web.service;

import com.web.dao.KeyWordDao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Taeyeon-Serenity on 2017/7/23.
 */
public class KeyWordService {
    public List<Object> findKw4Ajax(String kw) throws SQLException {
        return new KeyWordDao().findKw4Ajax(kw);
    }
}
