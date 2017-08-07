package com.web.servlet;

import com.web.domain.Province;
import com.web.service.ProvinceService;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Taeyeon-Serenity on 2017/7/23.
 */
/**
 * 查询所有的省
 * */
@WebServlet("/SelectProServlet")
public class SelectProServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //调用service 查询所有的省份
        List<Province> list= null;
        try {
            list = new ProvinceService().findAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //将所有的省份写回去
        response.setContentType("text/html;charset=utf-8");
        if(list!=null && list.size()>0){
            response.getWriter().println(JSONArray.fromObject(list));
        }
    }
}
