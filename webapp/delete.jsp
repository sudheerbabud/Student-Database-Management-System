<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Details Deleted</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f4f7fc; /* Soft background color for the page */
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
        }
        .container {
            background-color: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
            text-align: center;
            width: 100%;
            max-width: 500px;
        }
        h1 {
            color: #4CAF50;
            margin-bottom: 20px;
        }
        .btn-success {
            padding: 10px 20px;
            font-size: 16px;
            border-radius: 5px;
            background-color: #28a745;
            color: white;
            text-decoration: none;
        }
        .btn-success:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Details Deleted Successfully</h1>
        <form action="myreg" method="post">
           <button type="submit" class="btn btn-success">Return to Details</button>
        </form>
    </div>
</body>
</html>
