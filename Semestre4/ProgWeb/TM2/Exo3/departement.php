<?php
    $file = "departements.sqlite";
    try
    {
    $bd = new PDO("sqlite:$file");
    $requeteSQLITE="SELECT * FROM departements";
    $requete = $bd->query($requeteSQLITE);
    echo "<table border = '1'>\n";
    echo "<tr><th>Num</th><th>Nom</th></tr>";
    foreach ($requete as $line)
    {
        echo "<tr>";
        echo "<td>" . $line['no'] . "</td>";
        echo "<td>" . $line['nom'] . "</td>";
        echo "</tr>";
    }
    }
    catch(PDOException $e)
    {
        exit("Non connecté à la BD : ".$e->getMessage());
    }