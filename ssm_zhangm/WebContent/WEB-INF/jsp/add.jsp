<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="add" method="post">
<table border="1" cellspacing="0" align="center" width="500px" style="text-align: center;border:1px solid red">
	<tr><td colspan="2"><h4>添加</h4></td></tr>
	<tr>
	<td>姓名</td>
		<td><input type="text" name="sname"/></td>
	</tr>
	<tr>
		<td>性别</td>
		<td><input type="text" name="ssex"/></td>
	</tr>
	<tr>
		<td>年龄</td>
		<td><input type="text" name="sage"/></td>
	</tr>
	<tr>
		<td colspan="5"><input type="submit" value="确认添加"></input></td>
	</tr>
</table>
</form>
</body>
</html>