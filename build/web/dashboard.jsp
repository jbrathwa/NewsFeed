<%-- 
    Document   : dashboard
    Created on : Apr 7, 2019, 5:27:19 AM
    Author     : Jayraj Rathwa
--%>
<%@page import="java.util.Base64" %>
<%@page import="service.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
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
        <style>
            .profile {
                border-radius: 50%;
                height: 150px;
                width: 150px;
            }
        </style>
    </head>
    <body>
        <jsp:include page="header.jsp" />
        <% NewsService service = new NewsService();
           INewsService client = service.getBasicHttpBindingINewsService(); 
           Integer id = (Integer)session.getAttribute("authorid");
           Author a = client.getAuthor(id);
           
           byte[] img = a.getImagedata().getValue();
           String imgstr ="data:image/jpeg;base64,"+ Base64.getEncoder().encodeToString(img);
           
           ArrayOfNews newslist = client.getAllNews(id,null,null);
    
         %>
        <div class="container">
             <div class="jumbotron">
                 <div class="row">
                     <div class="col-md-2">
                         <img src="<%=imgstr%>" class="profile"></img>
                     </div>
                     <div class="col-md-2">
                         <br><br>
                         <h5><%= a.getAuthorName().getValue() %></h5>
                         <p><%= a.getAuthorCity().getValue() %></p>
                     </div>
                 </div>
                   <br>
                   <div class="row"><a class="btn btn-primary" href="addNews.jsp" role="button">Add News</a></div>
                   <% for( News n: newslist.getNews() ) { %>
                   <div class="row">  
                    <div class="col-md-12">
                     <div class="card" style="height: 100%;">
                     <div class="card-body">
                         <h4 class="card-title"><%= n.getTitle().getValue()  %></h4>
                         <h6 class="card-subtitle mb-2 text-muted"><%=  n.getDatetime().toString()  %></h6>
                         <p class="card-text"><%=  n.getDescription().getValue().substring(0, 9) %></p>
                         <a href="updateNews.jsp?id=<%= n.getNewsId().intValue() %>" class="card-link">Edit</a>
                         <a href="NewsController?edit=2&id=<%= n.getNewsId().intValue() %>" class="card-link">Delete</a>
                     </div>
                 </div>
                 </div>
                   </div>
                    <% } %>     
             </div>.
         </div>
    </body>
</html>
