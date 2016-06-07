<?php 
	if($_SERVER['REQUEST_METHOD']=='POST'){
		$id = $_POST['id'];
		$name = $_POST['name'];
		$username = $_POST['username'];
		$password= $_POST['password'];
		
		require_once('dbConnect.php');
		
		$sql = "UPDATE users SET name = '$name', username = '$username', password = '$password' WHERE id = $id;";
		
		if(mysqli_query($con,$sql)){
			echo 'Update Users Berhasil';
		}else{
			echo 'Update Users Gagal';
		}
		
		mysqli_close($con);
	}