<%-- 
    Document   : addNews
    Created on : Apr 6, 2019, 8:54:25 PM
    Author     : Jayraj Rathwa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New News</title>
        
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
                <form action="NewsController " method="post" enctype="multipart/form-data">
                    <div class="form-group">
                        <label for="title">Headline:</label>
                        <input type="text" class="form-control"  name="title" id="title" placeholder="News Headline">
                    </div>
                    <div class="form-group">
                        <label for="time">Date:</label>
                        <input type="date" class="form-control"  name="datetime" id="time">
                    </div>
                    <div class="form-group">
                        <label for="city">City:</label>
                        <input type="text" class="form-control"  name="city" id="city">
                    </div>
                     <div class="form-group">
                         <label for="topic">Topic:</label>
                        <select class="form-control"  name="topic" id="topic">
                            <option value="India">India</option>
                            <option value="World">World</option>
                            <option value="Politics">Politics</option>
                            <option value="Business">Business</option>
                            <option value="Science">Science</option>
                            <option value="Sports">Sports</option>
                            <option value="Tech">Tech</option>
                            <option value="Health">Health</option>
                        </select>
                     </div>
                     <div class="form-group">
                        <label for="description">Description:</label>
                        <textarea  class="form-control"  rows="10" name="description" id="description" placeholder="Write Here..."></textarea>
                     </div>
                     <div class="form-group">
                        <label for="image">News Image:</label>
                        <input type="file" class="form-control-file" name="image" id="image">
                    </div>
                    
                    <button type="submit" class="btn btn-primary">Post</button>
                </form>
            </div>
        </div>
    </body>
</html>
