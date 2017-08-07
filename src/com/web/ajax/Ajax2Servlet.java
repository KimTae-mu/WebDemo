package com.web.ajax;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Taeyeon-Serenity on 2017/7/22.
 */
@WebServlet("/Ajax2Servlet")
public class Ajax2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doGet(request, response);
        System.out.println(request.getMethod());
        request.setCharacterEncoding("utf-8");

        //接受参数
        String username=request.getParameter("username");
        System.out.println(username);

        //响应数据
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("post姓名："+username);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接受参数
        String username=request.getParameter("username");
        username=new String(username.getBytes("iso8859-1"),"utf-8");
        System.out.println(username);

        //响应数据
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("姓名："+username);
    }
}
