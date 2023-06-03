
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

</head>
<body>
<div class="container">
    <h1 style="text-align: center">Create New Product</h1>
<form method="post" action="/product?action=create">
    <div class="form-group">
        <label for="id">ID</label>
        <input type="text" class="form-control" id="id" aria-describedby="inputId" name="id">
        <small id="inputId" class="form-text text-muted">Id must be inputed</small>
    </div>
    <div class="form-group">
        <label for="name">Name Product</label>
        <input type="text" class="form-control" id="name" aria-describedby="inputName" name="name">
        <small id="inputName" class="form-text text-muted">
            Name must be 8-20 characters long, contain letters and numbers, and must not contain spaces, special characters, or emoji.
        </small>
    </div>
    <div class="form-group">
        <label for="price">Price</label>
        <input type="text" class="form-control" id="price" name="price">
    </div>
    <div class="form-group">
        <label for="descrise">Decrise</label>
        <input type="text" class="form-control" id="descrise" name="descrise">
    </div>
    <div class="form-group">
        <label for="producer">Producer</label>
        <input type="text" class="form-control" id="producer" name="producer">
    </div>
    <button type="submit" class="btn btn-success">Create</button>
</form>
</div>
<script>
    function validForm(){
        const  id =document.getElementById("id");
        const  name =document.getElementById("name");

        if(!name.contains("a")){
            document.getElementById("inputName").innerHTML = "name have to a char";
        }
    }
</script>
</body>
</html>
