<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="myreg" method="post">
    	<div class="container mt-5">
        <h2 class="text-center text-success">Error Occured</h2>
        <p class="text-center"><%= request.getAttribute("message") %></p>
        <div class="text-center mt-4">
            <button type="submit" class="btn btn-primary">Back to List</button>
        </div>
    </div>
    </form>
</body>
</html>