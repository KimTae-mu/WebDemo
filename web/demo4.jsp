<%--
  Created by IntelliJ IDEA.
  User: Taeyeon-Serenity
  Date: 2017/7/23
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
    <title>省市联动</title>
    <script type="text/javascript">
        $(function () {
            //页面加载成功 查询所有的省
            $.get("/WebDemo/SelectProServlet",function (d) {
//                alert(d);
                var $pro=$("#proId");
                $(d).each(function () {
                    $pro.append($("<option value="+this.provinceid+"'>"+this.name+"</option>"))
                })
            },"json");

            //给省份的下拉选派发change事件
            $("#proId").change(function () {
                //获取省份id
                var $pid=$(this).val();
                //发送ajax请求
                $.ajax({
                    url:"/WebDemo/SelectCityServlet",
                    data:{"pid":$pid},
                    type:"post",
                    dataType:"json",
                    success:function (obj) {
//                        alert(obj);
                        var $city=$("#cityId");
                        $city.html("<option>-请选择-</option>");
                        if(obj!=null){
                            $(obj).each(function () {
                                $city.append($("<option value='"+this.cityid+"'>"+this.name+"</option>"))
                            })
                        }
                    },
                });
            })
        })
    </script>
</head>
<body>
    <select id="proId" name="province">
        <option>-省份-</option>
    </select>
    <select id="cityId" name="city">
        <option>-请选择-</option>
    </select>
</body>
</html>
