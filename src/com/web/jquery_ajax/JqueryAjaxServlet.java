package com.web.jquery_ajax;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Taeyeon-Serenity on 2017/7/22.
 */
@WebServlet("/JqueryAjaxServlet")
public class JqueryAjaxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        System.out.println("请求方式:"+request.getMethod());
        //接收参数
        String username = request.getParameter("username");
        System.out.println(username);
//      {"result":"success","msg":"成功"}
        String s="{\"result\":\"success\",\"msg\":\"成功\"}";
        //响应数据
//        response.getWriter().print("success");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print(s);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("请求方式:"+request.getMethod());
        //接收参数
        String username = request.getParameter("username");
        username=new String(username.getBytes("iso-8859-1"),"utf-8");
        System.out.println(username);

        //响应数据
        response.getWriter().print("success");
    }
}
