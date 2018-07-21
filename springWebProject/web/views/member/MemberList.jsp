<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberList</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>나이</th>
			<th>선택</th>
		</tr>
	<c:forEach items="${list}" var="member">
		<tr>	
			<td><c:out value="${member.userid}"/></td>
			<td><c:out value="${member.username}"/></td>
			<td><c:out value="${member.age}"/></td>
			<td><a href="/swp/selectMember.do?userid=<c:out value='${member.userid}'/>">선택</a></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>