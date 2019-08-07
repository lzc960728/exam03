<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resource/css/list.css">
<%--  <c:if test="fn">checked</c:if> --%>
<!-- onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'#F{$dp.$D(\'createTime\')}'})" -->



<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/WdatePicker.js"></script>
</head>
<body>

	<table>
		<tr>
			<td><input type="checkbox" id="qx" >全选/反选</td>
			<td>学生编号</td>
			<td>学生姓名</td>
			<td>学生年龄</td>
			<td>学生爱好</td>
			<td>学生性别</td>
			<td>学生课程</td>
			<td>班级</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="l">
		<tr>
			<td><input type="checkbox" class="cb" value="${l.sid}"></td>
			<td>${l.sid}</td>
			<td>${l.sname}</td>
			<td>${l.age}</td>
			<td>${l.hobby}</td>
			<td>${l.sex}</td>
			<td>${l.kname}</td>
			<td>${l.cname}</td>
			<td>
				<input type="button" onclick="sc()" value="删除">
				<a href="toupdate?id="><input type="button" value="修改"></a>
			</td> 
		</tr>
		</c:forEach>
	</table>
	
</body>
<script type="text/javascript">
	
</script>

</html>