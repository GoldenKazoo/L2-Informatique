<?php

    $max = $_GET["max"];
    $file = "produits.sqlite";
    try
    {
    $bd = new PDO("sqlite:$file");
    $requeteSQLITE="SELECT * FROM produits";
    $requete = $bd->query($requeteSQLITE);
    echo "<table border = '1'>\n";
    echo "<tr><th>Nom</th><th>Prix</th></tr>";
    foreach ($requete as $line)
    {
        if ($line['prix'] <= $max)
        {
            echo "<tr>";
            echo "<td>" . $line['nom'] . "</td>";
            echo "<td>" . $line['prix'] . "</td>";
            echo "</tr>";
        }
    }
    }
    catch(PDOException $e)
    {
        exit("Non connecté à la BD : ".$e->getMessage());
    }
    echo "</table>\n";
?>