
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

<form action="PolicyBeforeDelete" method="post">
<input type="hidden" name="source2" value="viewPolicy"/>

<h1>Delete Policy</h1>

Policy ID : <input type="text" id="policyid" name="policyid"/>
<br><br>
<input type="submit" value="Delete" />


</form>

</body>
</html>