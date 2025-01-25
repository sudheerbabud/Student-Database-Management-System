<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <title>Update Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color:#f4f4f9;;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }
        .container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 800px;
            width: 100%;
        }
        #bu{
        	align-items:center;
        }
        h2 {
            color: #343a40;
            margin-bottom: 20px;
        }
        .details-container {
            display: flex;
            justify-content: space-between;
            flex-wrap: wrap;
        }
        .details-box {
            width: 48%;
            background-color: #f8f9fa;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 5px rgba(0, 0, 0, 0.1);
            margin-bottom: 20px;
        }
        .details-box h4 {
            color: #007bff;
        }
        .details-box p {
            margin: 5px 0;
        }
        @media (max-width: 768px) {
            .details-box {
                width: 100%;
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <h2 class="text-center">Update Details</h2>
        <div class="details-container">
      
            <div class="details-box">
                <h4>Old Details</h4>
                <p><strong>Username:</strong> <%= request.getParameter("username") %></p>
                <p><strong>Password:</strong> <%= request.getParameter("password") %></p>
                <p><strong>Email:</strong> <%= request.getParameter("email") %></p>
                <p><strong>Phone Number:</strong> <%= request.getParameter("phonenumber") %></p>
            </div>
   
            <div class="details-box">
                <h4>New Details</h4>
                <form action="update" method="post">
                    <div class="form-group">
                        <label for="username">Username (Readonly):</label>
                        <input type="text" id="username" name="username" class="form-control" 
                               value="<%= request.getParameter("username") %>" readonly>
                    </div>
                    <div class="form-group">
                        <label for="password">New Password:</label>
                        <input type="password" id="password" name="password" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="email">New Email:</label>
                        <input type="email" id="email" name="email" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="phonenumber">New Phone Number:</label>
                        <input type="tel" id="phonenumber" name="phonenumber" class="form-control">
                    </div>
                    <button type="submit" id="bu"class="btn btn-success">Update</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
