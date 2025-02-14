<?php 

if (isset($_POST["prenom"])&&isset($_POST["nom"])&&isset($_POST["id"])){
    $prenom = $_POST["prenom"];
    $nom = $_POST["nom"];  
    
    echo "Bonjour $prenom $nom <br>";

    if(is_numeric($_POST["id"])){
        $id = $_POST["id"]; 
        echo "votre identifiant est :$id "; 
    }

}

