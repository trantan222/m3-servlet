<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
          integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1 style="text-align: center;color:dimgray">Product List</h1>

    <form class="form-inline" method="post" style="margin-left: 750px">
        <div class="form-group mx-sm-3 mb-2">
            <input type="hidden" name ="action" value="search" >
            <label for="searchName" class="sr-only"></label>
            <input type="text" class="form-control" id="searchName" placeholder="Name" name="search">
        </div>
        <button type="submit" class="btn btn-primary mb-2" value="search">Search</button>
    </form>

    <p><a href="/product?action=create" role="button" class="btn btn-dark">Create new Product</a></p>
    <table class="table">
        <div>
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
                <th>Descrise</th>
                <th>Producer</th>
                <th colspan="3">Action</th>
            </tr>
            </thead>
        </div>
        <div>
            <tbody>
            <c:forEach items="${product}" var="product">
                <tr>
                    <td>${product.id}</td>
                    <td>${product.name}</td>
                    <td>${product.price}</td>
                    <td>${product.descrise}</td>
                    <td>${product.NSX}</td>
                    <td>
                        <a href="/product?action=edit&id=${product.getId()}" class="btn btn-secondary">Update</a>
                        <button
                                onclick="showModelDelete('${product.id}','${product.name}')"
                                type="button" class="btn btn-danger" data-toggle="modal" data-target="#modelDelete">
                            Delete
                        </button>
                        <a href="/product?action=descrise&id=${product.getId()}" class="btn btn-info">Descrise</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </div>
    </table>
    <div class="modal fade" id="modelDelete" tabindex="-1" role="dialog" aria-labelledby="modelTitleId"
         aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title">Modal title</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <p>Ban muon xoa: <span id="name" style="color: red">no name</span> ?</p>
                </div>
                <form action="/product">
                    <input type="hidden" name="action" value="delete">
                    <input type="hidden" name="id" value="" id="id">
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-danger">Delete</button>
                    </div>
                </form>
            </div>
        </div>
    </div>


</div>
</body>
<script src="https://code.jquery.com/jquery-3.5.1.js"

        crossorigin="anonymous"></script>
<script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"
        crossorigin="anonymous"></script>
<script src="https://cdn.datatables.net/1.13.4/js/dataTables.bootstrap4.min.js"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
<script>
    $(document).ready(function () {
        $('#product').dataTable({
            'pageLength': 2,
            'searching': false
        })
    })

    function showModelDelete(id, name) {
        console.log(id, name);
        document.getElementById("name").innerText = name;
        document.getElementById("id").value = id;
    }
</script>
</html>
