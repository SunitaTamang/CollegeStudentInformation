<link rel=" stylesheet" href="resources/bootstrap/css/bootstrap.min.css"/>
<link rel="stylesheet" href="resources/login.css"/>

<script type="text/javascript" src="resources/jquery.js"></script>
<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/login.js"></script>



<body>
	 <div class="container">
        <div class="card card-container">
     
            <img id="profile-img" class="profile-img-card" 
            	src="/Downloads/college.jpg" />
            <p id="profile-name" class="profile-name-card"></p>
            <form class="form-signin" action="college-login" method="post">
            
            <span style="color:red;">${msg}</span>
                <span id="reauth-email" class="reauth-email"></span>
                <input type="text" id="inputEmail" class="form-control" placeholder="Collegename" name="collegeName"  value="${cname}"required autofocus>
                <input type="password" id="inputPassword" class="form-control" placeholder="Password" name="passWord" value="${pass}" required>
                <div id="remember" class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me" name="rememberMe"> Remember me
                    </label>
                </div>
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Sign in</button>
            </form><!-- /form -->
            <a href="#" class="forgot-password">
                Forgot the password?
            </a>
        </div><!-- /card-container -->
    </div><!-- /container -->

</body>
</html>