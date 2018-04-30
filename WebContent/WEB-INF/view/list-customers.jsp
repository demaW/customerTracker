<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>

<head>
<title>List Customers</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
</head>

<body>
	<input type="button" class="add-button" value="Add Customer"
		onclick="window.location.href='showFormForAdd'; return false" />
	<div id="wrapper">
		<h1>CRM - Customer Manager</h1>
	</div>
	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>First name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>

				<c:forEach var="customer" items="${customers}">

					<tr>
						<td>${customer.firstName}</td>
						<td>${customer.lastName}</td>
						<td>${customer.email}</td>
					</tr>

				</c:forEach>
			</table>

		</div>
	</div>
</body>

</html>