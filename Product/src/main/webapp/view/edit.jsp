
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
<div class="container">
  <form action="/product?action=edit"method="post">
    <h1 style="text-align: center">Product Information</h1>
    <table class="table">
      <tr>
        <div>
          <td> <input type="hidden" name="id" value="${product.getId()}"></td>
        </div>
      </tr>
      <tr>
        <div>
          <td><label>Name</label></td>
          <td><input name="name" value="${product.getName()}"></td>
        </div>
      </tr>
      <tr>
        <div>
          <td> <label>Price</label></td>
          <td> <input name="price" value="${product.getPrice()}"></td>
        </div>
      </tr>
      <tr>
        <div>
          <td><label>description</label></td>
          <td><input name="descrise" value="${product.getDescrise()}"></td>
        </div>
      </tr>
      <tr>
        <div>
          <td><label>Producer</label></td>
          <td><input name="producer" value="${product.getNSX()}"></td>
        </div>
      </tr>
      <tr>
        <td><a href="/product" role="button" class="btn btn-dark">Back to Product List</a></td>
        <td><button role="button" type="submit" class="btn btn-success">Update</button></td>
      </tr>
    </table>
  </form>
</div>

</body>
</html>
