<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<script type="text/javascript">
	function ajaxdel(sid){
		$.ajax({
				url:'delete?sid='+sid,
				type:'get',
				success:function(data){
				if(data=="1"){
					$("#"+sid).remove();
				}
			}
			});
		}
</script>
</head>
<body>
<table border="1" cellspacing="0" align="center" width="500px" style="text-align: center;border:1px solid red">
	<tr>
		<td colspan="5">会员登录：${user.uname}</td>
	</tr>
	<tr>
		<td>编号</td>
		<td>姓名</td>
		<td>性别</td>
		<td>年龄</td>
		<td>操作</td>
	</tr>
	<c:forEach var="stulist" items="${stulist}">
	<tr id="${stulist.sid}">
		<td>${stulist.sid}</td>
		<td>${stulist.sname}</td>
		<td>${stulist.ssex}</td>
		<td>${stulist.sage}</td>
		<td>
			<a href="javascript:ajaxdel(${stulist.sid})">删除</a>
			<a href="selone?sid=${stulist.sid}">修改</a>
		</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="5"><a href="toadd">添加</a></td>
	</tr>
</table>
</body>
</html>