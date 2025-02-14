<?php
    $nom = $_GET["nom"];
    $prenom = $_GET["prenom"];
    $email = $_GET["email"];

    $file = "form.sqlite";
    $bd = new PDO("sqlite:$file");

    $bd->exec("DROP TABLE IF EXISTS form;
    CREATE TABLE form (id INTEGER PRIMARY KEY, nom text, prenom text, email text)
    ");
    $bd->exec("INSERT INTO form (nom, prenom, email) VALUES ($nom, $prenom, $email)");
    $requete = $bd->query("SELECT nom, prenom, email FROM form");
    foreach ($requete as $line)
    {
        echo "<tr>";
        echo "<td>" . $line['nom'] . "</td>";
        echo "<td>" . $line['prenom'] . "</td>";
        echo "<td>" . $line['email'] . "</td>";
        echo "</tr>";
    }
    echo "<\table>";