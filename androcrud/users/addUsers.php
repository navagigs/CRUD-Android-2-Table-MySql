<?php 
	if($_SERVER['REQUEST_METHOD']=='POST'){
		
		//Getting values
		$name = $_POST['name'];
		$username = $_POST['username'];
		$password = $_POST['password'];
		
		//Creating an sql query
		$sql = "INSERT INTO users (name,username,password) VALUES ('$name','$username','$password')";
		
		//Importing our db connection script
		require_once('dbConnect.php');
		
		//Executing query to database
		if(mysqli_query($con,$sql)){
			echo 'Add Users Berhasil';
		}else{
			echo 'Add Users Gagal';
		}
		
		//Closing the database 
		mysqli_close($con);
	}