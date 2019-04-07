<%-- 
    Document   : register
    Created on : Apr 7, 2019, 7:36:06 AM
    Author     : Jayraj Rathwa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="/CSS/style.css" >
    </head>
    <body>
        <jsp:include page="header.jsp" />
        <div class="container">
            <div class="jumbotron">
                <form action="RegisterController" method="post" enctype="multipart/form-data">
                  <div class="form-group">
                      <label for="username">Username:</label>
                    <input type="text" class="form-control" name="username" id="username"  placeholder="Enter Username">
                  </div>
                  <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" name="password" id="password" placeholder="Enter Password">
                  </div>
                  <div class="form-group">
                    <label for="city">City:</label>
                    <input type="text" class="form-control" name="city" id="city" placeholder="Enter City">
                  </div>
                  <div class="form-group">
                    <label for="image">Profile Picture:</label>
                    <input type="file" class="form-control-file" name="image" id="image">
                  </div>
                  
                  <button type="submit" class="btn btn-primary">Register</button>
                </form>
            </div>
        </div>
    </body>
</html>
