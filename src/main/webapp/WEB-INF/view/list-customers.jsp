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
					<th>Action</th>
				</tr>

				<c:forEach var="customer" items="${customers}">
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${customer.id}"></c:param>
					</c:url>
					
					<c:url var="deleteLink" value="/customer/delete">
						<c:param name="customerId" value="${customer.id}"></c:param>
					</c:url>
					<tr>
						<td>${customer.firstName}</td>
						<td>${customer.lastName}</td>
						<td>${customer.email}</td>
						<td><a href="${updateLink}">Update</a> | <a onclick="if(!(confirm('Are you sure you want to delete customer record?'))) return false;" href="${deleteLink}">Delete</a></td>
					</tr>

				</c:forEach>
			</table>

		</div>
	</div>
</body>

</html>