<%--
  Created by IntelliJ IDEA.
  User: Taeyeon-Serenity
  Date: 2017/7/22
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    原生的ajax<br/>
    <hr/>
    <a href="${pageContext.request.contextPath }/js_ajax/hello.jsp">入门</a><br/>
    <a href="${pageContext.request.contextPath }/js_ajax/get.jsp">get请求</a><br/>
    <a href="${pageContext.request.contextPath }/js_ajax/post.jsp">post请求</a><br/>
    <a href="${pageContext.request.contextPath }/demo1.jsp">案例1-检查用户名是否被占用</a><br/>
    <hr/>
    jquery的ajax<br/>
    <hr/>
    <hr/>
    <a href="${pageContext.request.contextPath }/jquery_ajax/ajax.jsp">jquery_ajax</a><br/>
    <a href="${pageContext.request.contextPath }/demo2.jsp">案例2-检查用户名是否被占用</a><br/>
    <a href="${pageContext.request.contextPath }/demo3.jsp">案例3-模拟百度搜索</a><br/>
    <a href="${pageContext.request.contextPath }/demo4.jsp">案例4-省市联动</a><br/>
  </body>
</html>
