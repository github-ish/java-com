<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
 <link href="navbar-static-top.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
<!-- Fixed navbar -->
    <nav class="navbar navbar-inverse navbar-static-top">
      <div class="container">
        <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <!-- The mobile navbar-toggle button can be safely removed since you do not need it in a non-responsive implementation -->
          <a class="navbar-brand" href="#">E-Journal</a>
        </div>
        <!-- Note that the .navbar-collapse and .collapse classes have been removed from the #navbar -->
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
          </ul>
          <form class="navbar-form navbar-left" role="search">
            <div class="form-group">
              <input type="text" class="form-control" placeholder="Search">
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
          </form>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="login.jsp">Sign in</a></li>

          </ul>
        </div><!--/.nav-collapse -->
         </div>
   </nav>
  
<div class="container">
	 <div class="jumbotron">
  <div class="row">
  <div class="col-md-3">
      <ul class="nav nav-pills nav-stacked">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="#">Track Your Submissions</a></li>
        <li><a href="#">Choose Articles for Review</a></li>
        <li><a href="#">Submit Reviews</a></li>
       
      </ul>
    </div>
    <div class="col-md-9">
     <div class="container">
  <h2>Review Form </h2>
  <form class="form-horizontal" role="form" method="post" action="reviewForm">
  
 <div class="form-group">
      <label class="control-label col-sm-2">Overall Judgement:</label>
      <div class="col-sm-10">  
		<textarea class="form-control" rows="2" id="judgement" name="judgement" required autofocus></textarea>
    </div>
      </div>
      
      <div class="form-group">
  <label for="sel1" class="control-label col-sm-2">Expertise Level:</label>
   <div class="col-sm-10">
  <select class="form-control" id="level" required autofocus>
    <option>Expert</option>
    <option>Knowledgeable</option>
    <option>Outsider</option>
  </select>
  </div>
</div>
    
     <div class="form-group">
      <label class="control-label col-sm-2">Summary:</label>
      <div class="col-sm-10">  
		<textarea class="form-control" rows="2" id="summary" name="summary"required autofocus></textarea>
    </div>
      </div>
      
      <div class="form-group">
      <label class="control-label col-sm-2">Novel Contribution:</label>
      <div class="col-sm-10">  
		<textarea class="form-control" rows="2" id="novel" name="novel"required autofocus></textarea>
    </div>
      </div>
      <div class="form-group">
      <label class="control-label col-sm-2">Summary:</label>
      <div class="col-sm-10">  
		<textarea class="form-control" rows="2" id="summary" name="summary" required autofocus></textarea>
    </div>
      </div>
      
      <div class="form-group">
      <label class="control-label col-sm-2">Critisim:</label>
      <div class="col-sm-10">  
		<textarea class="form-control" rows="2" name ="criticism"id="criticism" required autofocus></textarea>
		<button type="submit" class="btn btn-default" id="add">Add Field</button>
    </div>
      </div>
    <div class="form-group">
      <label class="control-label col-sm-2">Errors:</label>
      <div class="col-sm-10">  
		<textarea class="form-control" rows="2" name ="errors"id="errors"required autofocus></textarea>
	
    </div>
    
      </div>
      
       <div class="form-group">
      <label class="control-label col-sm-2">Comments to Editors:</label>
      <div class="col-sm-10">  
		<textarea class="form-control" rows="2" name ="comments"id="comments"></textarea>
	
    </div>
      </div>
      

    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
	    
    
    <div class="clearfix visible-lg"></div>
    </div>
  </div>
</div>
</div>
        
      </div>



</body>
</html>