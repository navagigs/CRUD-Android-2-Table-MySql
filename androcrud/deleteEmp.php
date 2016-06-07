<?php 
	$id = $_GET['id'];
	
	require_once('dbConnect.php');
	
	$sql = "DELETE FROM employee WHERE id=$id;";
	
	if(mysqli_query($con,$sql)){
		echo 'Employee Deleted Successfully';
	}else{
		echo 'Could Not Delete Employee Try Again';
	}
	
	mysqli_close($con);
