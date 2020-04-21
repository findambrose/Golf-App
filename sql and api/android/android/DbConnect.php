<?php

$servername = "localhost";
$username = "id13309641_root";
$password = "Ambworld11S-G";
$database = "id13309641_reelgolf";
 
 

$conn = new mysqli($servername, $username, $password, $database);
 

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}