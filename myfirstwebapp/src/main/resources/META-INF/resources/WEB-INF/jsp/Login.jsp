<html>
	<head>
	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"/>
	<title>
		Login Page
	</title>
	</head>
	<body>
		<h1>Login</h1>
		<pre>${errorMessage}</pre>
		<div class="container">
		<form method="post">
			<input type="text" name="name"/>
			<input type="password" name="password"/>
			<input type="submit"/>
		</form>
		</div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>