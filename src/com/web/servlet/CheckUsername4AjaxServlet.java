package com.web.servlet;

import com.web.domain.User;
import com.web.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Taeyeon-Serenity on 2017/7/22.
 */
@WebServlet("/CheckUsername4AjaxServlet")
public class CheckUsername4AjaxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码

        //接收用户名
        String username=request.getParameter("username");
        username=new String(username.getBytes("iso-8859-1"),"utf-8");
        System.out.println(username);

        //调用service 完成查询返回值user
        User user= null;
        try {
            user = new UserService().checkUsername4Ajax(username);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //判断user 写回信息
        if(user == null){
            response.getWriter().println("1");
        }else{
            response.getWriter().println("0");
        }
    }
}
