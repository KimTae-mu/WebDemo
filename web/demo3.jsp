<%--
  Created by IntelliJ IDEA.
  User: Taeyeon-Serenity
  Date: 2017/7/23
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
    <title>Title</title>
    <script type="text/javascript">
        $(function () {
            //文本框keyup的时候发送ajax
            $("#tid").keyup(function () {
                //获取文本框的值
                var $value=$(this).val();
                //内容为空的时候不发送ajax
                if($value!=null && $value!=''){
                    $("#did").html("");
                    /*$.post("/WebDemo/SearchKwServlet",{"kw":$value},function (d) {
                        if(d!=''){
                            var arr=d.split(",");
                            $(arr).each(function () {
//                                alert(this);
                                //可以将每一个值放入一个div 将其内部插入到id为did的div中
                                $("#did").append($("<div>"+this+"</div>"));
                            });
                            //将div显示
                            $("#did").show();
                        }
                    });*/
                    $.ajax({
                        url:"/WebDemo/SearchKwServlet",
                        data:{"kw":$value},
                        type:"post",
                        success:function (d) {
                            if(d!=''){
                                var arr=d.split(",");
                                $(arr).each(function () {
//                                alert(this);
                                    //可以将每一个值放入一个div 将其内部插入到id为did的div中
                                    $("#did").append($("<div>"+this+"</div>"));
                                });
                                //将div显示
                                $("#did").show();
                            }
                        },
                    })
                }else{
                    //将div隐藏
                    $("#did").hide();
                }
            });
        })
    </script>
</head>
<body>
    <center>
        <div>
            <h1>搜索</h1>
            <div>
                <input type="text" name="kw" id="tid"><input type="submit" value="搜索一下">
            </div>
            <div id="did" style="border: 1px solid red;width: 152px;position: relative;left: -33px;display: none"></div>
        </div>
    </center>
</body>
</html>
