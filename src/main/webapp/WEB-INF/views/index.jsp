<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">WebSiteName</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Page 1-1</a></li>
						<li><a href="#">Page 1-2</a></li>
						<li><a href="#">Page 1-3</a></li>
					</ul></li>
				<li><a href="#">Page 2</a></li>
				<li><a href="#">Page 3</a></li>
			</ul>
		</div>
	</nav>

	<script type="text/javascript">
		formValidation()
		{
			var firstName = document.getElementById('firstName').value;
			if (firstName.length > 2) {
				alert("hello world");
				return false;
			} else {
				alert("Chhala world");
				return true;
			}
		}
	</script>
	<div class="row">
		<div class="col-md-10">
			<div align="center">

				<table>
					<tr>
						<td style="color: green">${sucMsg}</td>
						<td></td>
					</tr>
					<form:form modelAttribute="formbinding" action="saved" onsubmit="formValidation()">
						<tr>
							<td><form:label path="firstName">FIRST NAME:-</form:label></td>
							<td><form:input path="firstName" id="firstName" /></td>

						</tr>
						<tr>
							<td><form:label path="lastName">LAST NAME:-</form:label></td>
							<td><form:input path="lastName" /></td>
						</tr>
						<tr>
							<td><form:label path="gender">GENDER:-</form:label></td>
							<td><form:radiobutton path="gender" value="MALE" />&nbsp;&nbsp;MALE&nbsp;&nbsp;<form:radiobutton
									path="gender" value="FEMALE" />&nbsp;&nbsp;FEMALE</td>
						</tr>
						<tr>
							<td><form:label path="email">EMAIL:-</form:label></td>
							<td><form:input path="email"
									pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" /></td>
						</tr>
						<tr>
							<td><form:label path="mobile">MOBILE:-</form:label></td>
							<td><form:input path="mobile" /></td>
						</tr>
						<tr>
							<td><form:label path="datofBirth">DATE OF BIRTH:-</form:label></td>
							<td><form:input path="datofBirth" type="date" /></td>
						</tr>

						<tr>
							<td></td>
							<td><input type="submit" value="REGISTER"
								class="btn btn-primary"></td>
						</tr>

					</form:form>
				</table>
			</div>
		</div>
	</div>
</body>
</html>