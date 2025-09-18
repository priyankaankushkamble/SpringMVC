<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	 body {
        font-family: Arial, sans-serif;
        background: #f2f2f2;
    }

    form {
        margin: 50px auto;
        width: 400px;
        padding: 20px;
        background: #fff;
        border: 1px solid #ccc;
    }

    input[type="text"], input[type="submit"] {
        width: 100%;
        padding: 10px;
        margin: 8px 0;
        border: 1px solid #ccc;
        font-size: 16px;
    }

    input[type="submit"] {
        background: #007BFF;
        color: #fff;
        border: none;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background: #0056b3;
    }
    h3{
    text-align:center;
    color:green;
    }
</style>
</head>
<body>

<body>
			
	<form name='frm' action='reg' method='post'>
		<h3>Registration Form</h3>
		<input type='text' name='name' value='' placeholder='Enter Name' /><br/><br/> 
		<input type='text' name='email' value=''placeholder='Enter Email' /><br/><br/>
		<input type='text' name='contact' value=''placeholder='Enter Contact' /><br/><br/> 
		<input type='submit' name='s' value='Register' /><br/><br/>
	</form>
</body>
</body>
</html>