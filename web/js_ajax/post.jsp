<%--
  Created by IntelliJ IDEA.
  User: Taeyeon-Serenity
  Date: 2017/7/22
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <input type="button" value="点我" onclick="btnClick()">
</body>
<script type="text/javascript">
    var xmlhttp;
    function btnClick() {
        //核心对象
        xmlhttp=null;
        if(window.XMLHttpRequest){
            xmlhttp=new XMLHttpRequest();
        }else if(window.ActiveXObject){
            xmlhttp=new ActiveXObject("Microsoft XMLHTTP");
        }

        //编写回调函数
        xmlhttp.onreadystatechange=function () {
            if(xmlhttp.readyState==4 && xmlhttp.status==200){
                alert(xmlhttp.responseText);
            }
        }

        //open
        xmlhttp.open("post","/WebDemo/Ajax2Servlet");

        //设置请求头
        xmlhttp.setRequestHeader("content-type","application/x-www-form-urlencoded");

        //send
        xmlhttp.send("username=张三")
    }
</script>
</html>
