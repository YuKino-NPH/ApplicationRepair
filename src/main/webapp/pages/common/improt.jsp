<%--
  Created by IntelliJ IDEA.
  User: YuKino-Nph
  Date: 2021/7/7
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String host=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/"+"ApplicationRepair/";
    request.setAttribute("host",host);
%>
<base href=<%=host%>>
<script src="static/js/jquery-3.1.1.js"></script>
<link href="static/bootstrap-3.4.1-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="static/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
