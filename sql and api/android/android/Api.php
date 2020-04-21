<?php 

header('Content-Type: application/json');
	require_once 'DbConnect.php';
	
	$response = array();
	
	if(isset($_GET['apicall'])){
		
		switch($_GET['apicall']){
			
			case 'signup':
				if(isTheseParametersAvailable(array('username','firstname','lastname','email','password',))){
					$username = $_POST['username']; 
					$firstname = $_POST['firstname']; 
					$lastname = $_POST['lastname']; 
					$email = $_POST['email']; 
					$password = md5($_POST['password']);
					
					
					$stmt = $conn->prepare("SELECT id FROM users_90105 WHERE username = ? OR email = ?");
					$stmt->bind_param("ss", $username, $email);
					$stmt->execute();
					$stmt->store_result();
					
					if($stmt->num_rows > 0){
						$response['error'] = true;
						$response['message'] = 'User already registered';
						$stmt->close();
					}else{
						$stmt = $conn->prepare("INSERT INTO users_90105 (username, firstname, lastname, email, password) VALUES (?, ?, ?, ?, ?)");
						$stmt->bind_param("sssss", $username, $firstname, $lastname, $email, $password);

						if($stmt->execute()){
							$stmt = $conn->prepare("SELECT id, id, username, firstname, lastname, email FROM users_90105 WHERE username = ?"); 
							$stmt->bind_param("s",$username);
							$stmt->execute();
							$stmt->bind_result($userid, $id, $username, $firstname, $lastname, $email);
							$stmt->fetch();
							
							$user = array(
								'id'=>$id, 
								'username'=>$username, 
								'firstname' => $firstname,

   								
								'lastname' => $lastname,

								'email'=>$email
								
							);
							
							$stmt->close();
							
							$response['error'] = false; 
							$response['message'] = 'User registered successfully'; 
							$response['user'] = $user; 
						}
					}
					
				}else{
					$response['error'] = true; 
					$response['message'] = 'required parameters are not available'; 
				}
				
			break; 
			
			case 'login':
				
				if(isTheseParametersAvailable(array('username', 'password'))){
					
					$username = $_POST['username'];
					$password = md5($_POST['password']); 
					
					$stmt = $conn->prepare("SELECT id, username, firstname, lastname, email FROM users_90105 WHERE username = ? AND password = ?");
					$stmt->bind_param("ss",$username, $password);
					
					$stmt->execute();
					
					$stmt->store_result();
					
					if($stmt->num_rows > 0){
						
						$stmt->bind_result($id, $username, $firstname, $lastname, $email);
						$stmt->fetch();
						
						$user = array(
							 	'id'=>$id, 
								'username'=>$username, 
								'firstname' => $firstname,

   								
								'lastname' => $lastname,

								'email'=>$email
						);

					
						
						$response['error'] = false; 
						$response['message'] = 'Login successfull'; 
						$response['user'] = $user; 
					}else{
						$response['error'] = false; 
						$response['message'] = 'Invalid username or password';
					}
				}
			break; 
			
			default: 
				$response['error'] = true; 
				$response['message'] = 'Invalid Operation Called';
		}
		
	}else{
		$response['error'] = true; 
		$response['message'] = 'Invalid API Call';
	}

    
	
	echo json_encode($response);
	
	function isTheseParametersAvailable($params){
		
		foreach($params as $param){
			if(!isset($_POST[$param])){
				return false; 
			}
		}
		return true; 
	}