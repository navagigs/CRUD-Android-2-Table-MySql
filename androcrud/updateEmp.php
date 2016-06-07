<?php 
	if($_SERVER['REQUEST_METHOD']=='POST'){
		$id = $_POST['id'];
		$name = $_POST['name'];
		$desg = $_POST['desg'];
		$sal = $_POST['salary'];
		
		require_once('dbConnect.php');
		
		$sql = "UPDATE employee SET name = '$name', designation = '$desg', salary = '$sal' WHERE id = $id;";
		
		if(mysqli_query($con,$sql)){
			echo 'Employee Updated Successfully';
		}else{
			echo 'Could Not Update Employee Try Again';
		}
		
		mysqli_close($con);
	}