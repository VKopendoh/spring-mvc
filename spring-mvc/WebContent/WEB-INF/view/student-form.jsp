<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>

<title>Student form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName"/>
		<br><br>
		Last name: <form:input path="lastName"/>
		<br><br>
		
		Country:
		<%-- <form:select path="country">
			<form:options items="${student.countryOptions}"/>
		</form:select> --%>
		<form:select path="country"> 
			 <form:options items="${theCountryOptions}" />
		</form:select>
		<br><br>
		Favorite language:
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		C# <form:radiobutton path="favoriteLanguage" value="C#"/>
		PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
		Python <form:radiobutton path="favoriteLanguage" value="Python"/>
		<br><br>
		Operating systems:
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
		IBM OS 390 <form:checkbox path="operatingSystems" value="OS 390"/>
		
		<br><br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>