<%--
  Created by IntelliJ IDEA.
  User: Taeyeon-Serenity
  Date: 2017/7/22
  Time: 14:33
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
    function btnClick(){
        //1.编写核心对象
        xmlhttp=null;
        if(window.XMLHttpRequest){
            xmlhttp=new XMLHttpRequest();
        }else if(window.ActiveXObject){
            xmlhttp=new ActiveXObject("Microsoft.XMLHTTP")
        }

        //2.编写回调函数
        xmlhttp.onreadystatechange=function(){
//            alert(xmlhttp.readyState);
            if(xmlhttp.readyState==4 && xmlhttp.status==200){
//                alert('ok');
                //接受服务器回送过来的数据
                alert(xmlhttp.responseText);
            }
        }

        //3.open 设置请求的方式和请求路径
        xmlhttp.open("get","${pageContext.request.contextPath }/Ajax1Servlet");

        //4.send 发送请求
        xmlhttp.send();
    }
</script>
</html>
