<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

</head>
<body>
<div class="container" >
<h1 style="text-align: center">Danh Sách Khách Hàng</h1>
<table class="table">
  <thead>
  <tr>
  <th>Name</th>
  <th>Date</th>
  <th>Address</th>
  <th>Image</th>
  </tr>
  </thead>
  <c:forEach items="${list}" var="list" >
    <tr>
      <td>${list.name}</td>
      <td>${list.date}</td>
      <td>${list.address}</td>
      <td><img src="/img/${list.image}" width="30px"></td>
    </tr>
  </c:forEach>
</table>
</div>
</body>
</html>
