<?php 
	require_once('dbConnect.php');
	
	$username =  $_POST['username'];
	$password =  $_POST['password'];
	$sql = "SELECT * FROM users WHERE username=:username and password=:password";
	
	if(mysqli_query($con,$sql)){
		echo 'Login Successfully';
	}else{
		echo 'Login Try Again';
	}
	
	mysqli_close($con);