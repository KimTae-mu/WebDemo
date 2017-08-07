package com.web.servlet;

import com.web.service.KeyWordService;

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
 * 模仿百度进行模糊搜索
 * */
@WebServlet("/SearchKwServlet")
public class SearchKwServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");

        //获取kw
        String kw=request.getParameter("kw");

        //调用service完成模糊操作 返回值：list
        List<Object> list= null;
        try {
            list = new KeyWordService().findKw4Ajax(kw);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //将数据{a,aa,aaa}去掉括号 写回去
        if(list!=null && list.size()>0){
            String s=list.toString();
            s=s.substring(1,s.length()-1);
            System.out.println(s);
            response.getWriter().println(s);
        }
    }
}
