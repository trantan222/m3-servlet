<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculate</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
          integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<style>
    h1 {
        text-align: center;
    }
</style>
<body>
<div class="container">
<h1>Simple Calculator</h1>
<form action="/calculate" method="post" role="form">
    <div class="form-group">
    <h3>First Operand</h3>
    <input type="text" placeholder="input here" name ="n1">
    </div>

    <div class="form-group">
    <h3> Operator</h3>
    <select name="option">
        <option value="+">Addition</option>
        <option value="-">Minus</option>
        <option value="*">Mutiply</option>
        <option value="/">Devide</option>
    </select>
        </div>

        <div class="form-group">
            <h3>Second Operand</h3>
            <input type="text" placeholder="input here" name ="n2">
        </div>
    <button type="submit" class="btn btn-secondary">Calculate</button>
</form>
</div>
</body>
</html>