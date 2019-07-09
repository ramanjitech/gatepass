<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Add Owner</title>
	</head>
<body style="font-family: consolars; font-size: 20px"> 
   <h1> Add Owner </h1>
 <form:form commandName="addOwnerCommand"><br>
 <p style="color: red; ">
 <form:errors path="*"/>
 </p>
 Owner Name<form:input path="ownerName"/><br>
 Age <form:input path="age"/><br>
 Gender <form:radiobutton path="gender" value="M"/>Male <form:radiobutton path="gender" value="F"/>Female<br>
Mobile <form:input path="mobileNo"/><br>
EmailAddress<form:input path="emailAddress"/><br>
Flat No<form:input path="flatNo"/><br>
Facing<form:select path="facing">
<form:option value="east">east</form:option>
<form:option value="north">north</form:option>
<form:option value="south">south</form:option>
<form:option value="west">west</form:option>
</form:select><br>

Floor<form:input path="floor"/><br>
BlockNo<form:input path="blockNo"/><br>

<input type="submit" value="AddOwner">
 </form:form>



</body>
</html>