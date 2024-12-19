<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to Xworkz</title>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #000000; /* Black background */
            color: #f1c40f; /* Light Yellow Text */
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
        }

        .header-logo {
            height: 60px;
            width: 60px;
            transition: transform 0.3s ease-in-out;
        }

        .header-logo:hover {
            transform: rotate(360deg);
        }

        .header-bar {
            background-color: rgba(0, 0, 0, 0.6); /* Semi-transparent black */
            padding: 20px 30px;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.4);
        }

        .header-btns .btn {
            font-size: 16px;
            transition: background-color 0.3s, transform 0.3s, box-shadow 0.3s;
            border-radius: 25px;
        }

        .header-btns .btn:hover {
            background-color: #f39c12;
            transform: scale(1.1);
            box-shadow: 0 4px 15px rgba(243, 156, 18, 0.7);
        }

        .container {
            background-color: rgba(0, 0, 0, 0.8); /* Slightly darkened background */
            padding: 70px 40px;
            border-radius: 15px;
            max-width: 600px;
            margin-top: 100px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.7);
        }

        .container h1 {
            font-size: 3em;
            font-weight: bold;
            margin-bottom: 20px;
            text-shadow: 3px 3px 5px rgba(0, 0, 0, 0.5);
        }

        .container p {
            font-size: 1.5em;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.4);
        }
    </style>
</head>
<body>

    <!-- Header Section -->
    <nav class="navbar navbar-expand-lg header-bar">
        <a class="navbar-brand" href="#">
            <img src="https://th.bing.com/th?id=OIP.5W588qZyeMAuWUs1PAIKyAAAAA&w=250&h=250&c=8&rs=1&qlt=90&o=6&pid=3.1&rm=2" alt="Logo" class="header-logo">
        </a>
        <div class="ml-auto header-btns">
            <a href="SignIn.jsp" class="btn btn-outline-light mr-2">Login</a>
            <a href="SignUp.jsp" class="btn btn-light">SignUp</a>
        </div>
    </nav>

    <!-- Body Section -->
    <div class="container text-center">
        <h1>Welcome to Xworkz</h1>
        <p class="lead">Java Full Stack Development</p>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
