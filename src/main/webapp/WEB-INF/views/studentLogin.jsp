<link rel=" stylesheet" href="resources/bootstrap/css/bootstrap.min.css"/>
<link rel="stylesheet" href="resources/login.css"/>

<script type="text/javascript" src="resources/jquery.js"></script>
<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/login.js"></script>



<body>
	 <div class="container">
        <div class="card card-container">
    		 <img id="profile-img" class="profile-img-card" 
            	src="image_display?id=${id}" />
            <p id="profile-name" class="profile-name-card"></p>
            <span style="color: red;"> ${forgotPassMsg }</span>
            <form class="form-signin" action="student-login" method="post">
            
            <span style="color:red;">${msg}</span>
                <span id="reauth-email" class="reauth-email"></span>
                <input type="text" id="inputEmail" class="form-control" placeholder="Student Name" name="studentName"  value="${sname}"required autofocus>
                <input type="password" id="inputPassword" class="form-control" placeholder="Password" name="spassWord" value="${spass}" required>
                <div id="remember" class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me" name="rememberMe"> Remember me
                    </label>
                </div>
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Sign in</button>
            </form><!-- /form -->
            
           <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">Forget password</button> 
           </div><!-- /card container -->
       </div><!-- /container -->
           
   <!-- /Button trigger modal -->
   
   <!-- /Modal -->
          <div class = "modal fade" id = "exampleModal" tabindex="-1" role = "dialog" 
          aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class = "modal-dialog " role="document">
               <div class = "modal-content">
                  <div class = "modal-header">
                  	 <h5 class = "modal-title" id="exampleModalLabel"> Modal title </h5>
                     <button type = "button" class = "close" data-dismiss = "modal" aria-label="Close">
                    	 <span aria-hidden="true" >&times;</span>
                     </button>
                    
                  </div>
                  <div class = "modal-body">
                     <form action="forgot-student-password" method="post">
                     
                     <div class="form-group">
                     <label>Email</label>
                     <input type="text" name="email" placeholder="Email" class="form-control">
                     </div>
                     
                     <div class="form-group">
                     <button type = "submit" class = "btn btn-primary" >Send</button>
                     </div>
                     </form>
                  </div>
                  <div class = "modal-footer">
                     <button type = "button" class = "btn btn-primary" data-dismiss = "modal">Close</button>
                      
                  </div>
               </div>
            </div>
           </div>

</body>
</html>