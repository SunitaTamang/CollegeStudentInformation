<link rel=" stylesheet" href="resources/bootstrap/css/bootstrap.min.css"/>
<link rel=" stylesheet" href="resources/bootstrap/style.css"/>
<script type="text/javascript" src="resources/jquery.js"></script>
<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>


<nav class="navbar navbar-expand-lg navbar-inverse bg-dark">
  <a style="color:Yellow" class="navbar-brand"  href="collegePage">College-Student Information System</a>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a style="color:Yellow" class="nav-link" href="list_college"> Colleges Info <span class="sr-only">(current)</span></a>
      </li>
      
	<li class="nav-item dropdown">
        <a style="color:Yellow" class="nav-link dropdown-toggle" href="list_student_names" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        Student Info </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
        <a style="color:Darkgreen"   class="dropdown-item" href="list_student_names"><b>Student Names</b></a>
        <a style="color:Darkgreen"   class="dropdown-item" href="list_student_personalInfo"><b>Student Personal Information</b></a>
          <a style="color:Darkgreen"  class="dropdown-item" href="list_student_contactInfo"><b>Student Contact Information</b></a>
           <a style="color:Darkgreen"  class="dropdown-item" href="list_student"><b>Student All Information</b></a>
        </div>
   	  </li>
   	   
      <li class="nav-item dropdown">
        <a style="color:Yellow" class="nav-link dropdown-toggle" href="list_college" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        College Management </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
        <a style="color:Darkgreen"   class="dropdown-item" href="cReset"><b>Reset Password</b></a>
          <a style="color:Darkgreen"  class="dropdown-item" href="collegelogout"><b>Logout</b></a>
        </div>
      </li>
    </ul>
    
  </div>
</nav>