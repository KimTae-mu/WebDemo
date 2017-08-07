<%--
  Created by IntelliJ IDEA.
  User: Taeyeon-Serenity
  Date: 2017/7/22
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
    <title>Title</title>
    <script type="text/javascript">
        $(function () {
            $("#btn").click(function () {
                var url="/WebDemo/JqueryAjaxServlet";
//                var params="username=张三";
                var params={"username" :"张三"};
                /*$(this).load(url,params,function (d) {
                    alert(d);
                });*/
                //get方式
                /*$.get(url,params,function (d) {
                    alert(d);
                })*/
                //post方式
                /*$.post(url,params,function (d) {
                    alert(d);
                })*/
                //ajax方式
                $.ajax({
                    url:url,
                    type:"post",
                    data:params,
                    success:function (d) {
                        alert(d.msg);
                    },
                    error:function () {},
                    dataType:"json"
                });
            });
        })
    </script>
</head>
<body>
    <input type="button" id="btn" value="点我">
</body>
</html>
