<%--
  Created by IntelliJ IDEA.
  User: Taeyeon-Serenity
  Date: 2017/7/22
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
    <title>Title</title>
    <script type="text/javascript">
        $(function () {
            //给username派发一个失去焦点事件 发送ajax请求
            $("input[name='username']").blur(function () {
                //获取输入的值
                var $value=$(this).val();
//                alert($value);
                /*$.get("/WebDemo/CheckUsername4AjaxServlet",{"username":$value},function (d) {
//                    alert(d);
                    if(d==1){
                        $("#username_msg").html("<font color='green'>用户名可以使用</font>")
                    }else{
                        $("#username_msg").html("<font color='red'>用户名已被占用</font>")
                    }
                });*/
                /*$.post("/WebDemo/CheckUsername4AjaxServlet",{"username":$value},function (d) {
                 if(d==1){
                 $("#username_msg").html("<font color='green'>用户名可以使用</font>")
                 }else{
                 $("#username_msg").html("<font color='red'>用户名已被占用</font>")
                 }
                 });*/
                $.ajax({
                    url:"/WebDemo/CheckUsername4AjaxServlet",
                    data:{"username":$value},
                    type:"post",
                    success:function (d) {
                        if(d==1){
                            $("#username_msg").html("<font color='green'>用户名可以使用</font>")
                        }else{
                            $("#username_msg").html("<font color='red'>用户名已被占用</font>")
                        }
                    },
                    error:function (d) {
                        alert("出错了");
                    }
                });
            })
        })
    </script>
</head>
<body>
<form method="post" action="#">
    <table>
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="username"></td>
            <td><span id="username_msg"></span></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="text" name="password"></td>
            <td></td>
        </tr>
        <tr>
            <td colspan='3'><input type="submit" id="sub"></td>
        </tr>
    </table>
</form>
</body>
<script type="text/javascript">
    //失去焦点发送ajax
    function checkUsername(obj) {
//        alert(obj.value);
        //创建核心对象
        xmlhttp=null;
        if(window.XMLHttpRequest){
            xmlhttp=new XMLHttpRequest();
        }else if(window.ActiveXObject){
            xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
        }
        //编写回调函数
        xmlhttp.onreadystatechange=function () {
            if(xmlhttp.readyState==4 && xmlhttp.status==200){
//                alert(xmlhttp.responseText);
                if(xmlhttp.responseText==1){
                    document.getElementById("username_msg").innerHTML="<font color='green'>用户名可以使用</font>";
                    document.getElementById("sub").disabled=false;
                }else{
                    document.getElementById("username_msg").innerHTML="<font color='red'>用户名已被占用</font>";
                    document.getElementById("sub").disabled=true;
                }
            }
        }
        //open
        xmlhttp.open("get","${pageContext.request.contextPath }/CheckUsername4AjaxServlet?username="+obj.value);

        //send
        xmlhttp.send();

    }
</script>
</html>
