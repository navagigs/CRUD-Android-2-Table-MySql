<?php 
	$id = $_GET['id'];
	
	require_once('dbConnect.php');
	
	$sql = "DELETE FROM users WHERE id=$id;";
	
	if(mysqli_query($con,$sql)){
		echo 'Delete Users Berhasil';
	}else{
		echo 'Delete Users Gagal';
	}
	
	mysqli_close($con);
