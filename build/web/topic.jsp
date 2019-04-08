<%-- 
    Document   : topic
    Created on : Apr 6, 2019, 9:42:15 PM
    Author     : Jayraj Rathwa
--%>

<%@page import="java.util.Base64"%>
<%@page import="java.util.List"%>
<%@page import="service.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${ param.topic }</title>
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="/CSS/style.css" >
        
        <style>
            .img-container {
                width: 420px;
                height: 200px;
            }
            .img-container img{
                width: 100%;
                height: auto;
            }
        </style>
    </head>
    <body>
        <jsp:include page="header.jsp" />
        <%          
                    NewsService service = new NewsService();
                    INewsService client = service.getBasicHttpBindingINewsService();

                    String topic = request.getParameter("topic");
                    ArrayOfNews newslist = client.getAllNews(0,topic,null);
                   
                    
                            //byte[] img = n.getImagedata().getValue();
                    //String imgstr ="data:image/jpeg;base64,"+ Base64.getEncoder().encodeToString(img);
        %>
        <div class="container">
            
        <div class="jumbotron">
            <h1>${ param.topic }</h1>
            
            <!--<div class="row"> 
                <div class="col-md-12"> 
                <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                     <% for(News n:newslist.getNews()){%>
                    <div class="carousel-inner">
                        
                       
                        <div class="carousel-item">
                            <div class="card mb-3">
                                <div class="row no-gutters">
                                    <div class="col-md-4">
                                        <img src="https://via.placeholder.com/620" class="card-img" alt="...">
                                    </div>
                                    <div class="col-md-8">
                                        <div class="card-body">
                                        <h5 class="card-title"><%= n.getTitle().getValue() %></h5>
                                        <p class="card-text"><%= n.getDescription().getValue().substring(0,70) %>....</p>
                                        <p class="card-text"><small class="text-muted">Last updated <%= String.valueOf(n.getDatetime().getHour()) %> Hours ago o</small></p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                       
                        
                    </div>
                   <% } %>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
                </a>
                </div>
            </div>-->
            
            <br><br>
            <div class="row">
                &nbsp;&nbsp;&nbsp;<h3>${ param.topic } News</h3>
                <div class="col-md-12">
                <div class="list-group">
                    <% for(News n:newslist.getNews()){ %>
                    <a href="news.jsp?id=<%= n.getNewsId().intValue() %>" class="list-group-item list-group-item-action">
                        <div class="d-flex  justify-content-between">
                           <h5 class="mb-1"><%= n.getTitle().getValue() %></h5>
                           <small><%= String.valueOf(n.getDatetime().getHour()) %> Hours ago </small>
                        </div>
                        <small>Report by: <%= n.getAuthor().getValue().getAuthorName().getValue() %></small>
                        <p class="mb-1"><%= n.getDescription().getValue().substring(0,70) %>....</p>
                    </a>
                    <% } %>
                </div>
                </div>    
            </div> 
              
        </div> 
        </div>
        </div>          
    </body>
</html>
