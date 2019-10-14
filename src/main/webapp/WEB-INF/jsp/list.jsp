<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>编号</td>
			<td>名称</td>
			<td>价格</td>
			<td>百分比值</td>
		</tr>
		<c:forEach items="${goodsList }" var="good">
			<tr>
				<td>${good.gid }</td>
				<td>${good.gname }</td>
				<td>${good.price }</td>
				<td>${good.baifen }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>