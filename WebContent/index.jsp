<%@page import="java.util.Iterator"%>
<%@page import="com.Dao.Student"%>
<%@page import="com.Bean.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CrudOperation</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<script type="text/javascript">
	function update(id,name,address,dob,course) {
		document.getElementById('id').value=id;
		document.getElementById('name').value=name;
		document.getElementById('address').value=address;
		document.getElementById('dob').value=dob;
		document.getElementById('course').value=course;
		document.getElementById('submit').innerHTML="update";
		document.getElementById('submit').value="update";
		}
	
	</script>

<body>

<form action="co" method="post">
<div class="container">
<div class="row justify-content-center">
<h2>SUBMIT FORM</h2>
</div>
<!-- <div class="row justify-content-center">
<div class="form-group col-4">
<label for="name">Student ID:</label>
<input type="text" class="form-control" name="id" id="id" readonly="readonly">
</div></div> -->
<div class="row justify-content-center">
<div class="form-group col-4">
<label for="name">Student name:</label>
<input type="text" class="form-control" id="name" name="name">
</div></div>
<div class="row justify-content-center">
<div class="form-group col-4">
<label for="address">Address:</label><input type="text" class="form-control" id="address" name="address">
</div></div>
<div class="row justify-content-center">
<div class="form-group col-4">
<label for="dob">Date of birth:</label><input type="text" class="form-control" id="dob" name="dob">
</div></div>
<div class="row justify-content-center">
<div class="form-group col-4">
<label for="course">Course:</label><input type="text"  class="form-control" id="course" name="course"></div>

</div>
  </div>
  <div class="row justify-content-center">
  <div class="form-group">

<input type="submit" class="btn btn-primary" id="submit" name="submit">
</div></div>
<div class="container">

<table class="table">
<tr>
<th>Id:</th>
<th>Student_name:</th>
<th>Address:</th>
<th>Date of birth:</th>
<th>course:</th>
<th>course joing date:</th>
<th>Delete</th>
<tr>
<% List<User> li=Student.Fetch(); 
Iterator itr=li.iterator();%>

<%
while(itr.hasNext()){
User u=(User)itr.next();%>

<tr>
<td><%=u.getId() %></td>
<td><%=u.getName() %></td>
<td><%=u.getAddress() %></td>
<td><%=u.getDob()%></td>
<td><%=u.getCourse() %></td>
<td><%=u.getJoing() %></td>
<td><a href=co?id=<%=u.getId() %>>Delete</a></td>
<td><a href="#"onclick="update('<%=u.getId()%>','<%=u.getName()%>','<%=u.getAddress()%>','<%=u.getDob() %>','<%=u.getCourse() %>')">update</a></td>
</tr>	
<%	
}
%>
</table>
</div>
</form>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  
</body>
</html>