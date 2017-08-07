package com.web.servlet;

import com.web.domain.City;
import com.web.service.CityService;
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
@WebServlet("/SelectCityServlet")
public class SelectCityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        //获取省份的id
        String pid=request.getParameter("pid");

        //根据id调用CityService查询所有的市 返回list
        List<City> list= null;
        try {
            list = new CityService().findCitiesByPid(pid);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //将list转换成json 返回页面
        if(list!=null && list.size()>0){
            response.getWriter().println(JSONArray.fromObject(list));
        }
    }
}
