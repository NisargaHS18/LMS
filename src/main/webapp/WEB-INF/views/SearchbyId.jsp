<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>

<style>
body {
  font-family: "Lora", Regular italic;
  
}

.sidenav {
  height: 100%;
  width: 160px;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #46ABA5;
  overflow-x: hidden;
  padding-top: 20px;
}

.sidenav a {
  padding: 6px 8px 6px 16px;
  text-decoration: blink;
  font-size: 25px;
  color: #fff;
  display: block;
}

.sidenav a:hover {
  color: #f1f1f1;
}

.main {
  margin-left: 160px; /* Same as the width of the sidenav */
  font-size: 28px; /* Increased text to enable scrolling */
  padding: 0px 10px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 25px;}
}

</style>


<body background="/resources/images/Library-Backgrounds-Download-Free.jpg"
	alt="Not found" height="700" width="700">
      
	<!-- Sidebar -->
	<div class="sidenav" style="width: 20%">

		<h3 class="w3-bar w3-grey">Menu</h3>
		
		<a href="/AddBook" class="w3-bar-item w3-button">Add Book</a>
		<a href="/AddUser" class="w3-bar-item w3-button">Add User</a>
		<a href="/Search" class="w3-bar-item w3-button">Search Book</a> 
		<a href="/issueBook" class="w3-bar-item w3-button">Issue Book</a>
		<a href="view_user/view_user_home.jsp" class="w3-bar-item w3-button">View User Details</a>
		<a href="return_book/return_book_home.jsp" class="w3-bar-item w3-button">Return book</a>
	</div>

	<div style="margin-left: 20%">

		<div class="w3-container w3-teal">
			<h1>Library Management System</h1>
		</div>


		<div class="w3-container">
			<h2>Search Book</h2>
			<center>

				<form action="/Search" method="post">
					<table>

						<tr>
							<td>Search By</td>

							<td><select name="by">
									<option value="name">Name</option>
									<option value="author">Author</option>
									<option value="isbn">ISBN</option>
									<option value="language">Language</option>

							</select></td>
							<td>Enter</td>
							<td><input type="text" name="text"></td>
						<tr>
							<td></td>
							<td><input type="submit" value="Search books"></td>
						</tr>
					</table>

				</form>
			</center>
		</div>

	</div>


</body>
</html>
