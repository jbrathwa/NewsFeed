<%-- 
    Document   : header
    Created on : Apr 6, 2019, 8:56:41 PM
    Author     : Jayraj Rathwa
--%>

<%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        
<header>        
<div>
    <div class="container">
        <div class="row">
            <div class="col-lg-4">
                <div id="Date"><%= (new Date()).toString() %></div>
            </div>
            <div class="col-lg-3 offset-lg-5">
                <ul class="nav"> 
                    <li class="nav-item"><a target="_blank" href="#" class="nav-link fa fa-facebook"></a></li>
                    <li class="nav-item"><a target="_blank" href="#" class="nav-link fa fa-twitter"></a></li>
                    <li class="nav-item"><a target="_blank" href="#" class="nav-link fa fa-google-plus"></a></li>
                    <li class="nav-item"><a target="_blank" href="#" class="nav-link fa fa-linkedin"></a></li>
                    <li class="nav-item"><a target="_blank" href="#" class="nav-link fa fa-youtube"></a></li>
                </ul>
            </div>
        </div>
    </div>
</div> 
            <div>
                
            </div>            
</header>        
    
<nav class="navbar sticky-top navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
        <a class="navbar-brand" href="index.jsp">TheOpenNews</a>  
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="exCollapsingNavbar2">
      <ul class="nav navbar-nav ">
        <li class="nav-item active"> <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a> </li>
        <li class="nav-item"> <a class="nav-link" href="topic.jsp?topic=India">India</a> </li>
        <li class="nav-item"> <a class="nav-link" href="topic.jsp?topic=World">World</a> </li>
        <li class="nav-item"> <a class="nav-link" href="topic.jsp?topic=Politics">Politics</a> </li>
        <li class="nav-item"> <a class="nav-link" href="topic.jsp?topic=Business">Business</a> </li>
        <li class="nav-item"> <a class="nav-link" href="topic.jsp?topic=Science">Science</a> </li>
        <li class="nav-item"> <a class="nav-link" href="topic.jsp?topic=Sports">Sports</a> </li>
        <li class="nav-item"> <a class="nav-link" href="topic.jsp?topic=Tech">Tech</a> </li>
        <li class="nav-item"> <a class="nav-link" href="topic.jsp?topic=Health">Health</a> </li>
      </ul>
        <ul class="nav justify-content-end">
            <li class="nav-item">
                <% if(session.getAttribute("authorid") == null){ %>
                    <a class="btn btn-success" href="login.jsp" role="button">Login</a>
                <% }else{ %>
                    <a class="btn btn-info" href="dashboard.jsp" role="button">My Posts</a>
                    <a class="btn btn-success" href="LoginController?login=1" role="button">Logout</a>
                <% } %>    
            </li>  
        </ul>  
    </div>
  </div>
</nav>
