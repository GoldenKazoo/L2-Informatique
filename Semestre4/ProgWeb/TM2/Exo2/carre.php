<?php

    $first = $_GET["First"];
    $square = 0;
    $cube = 0;
    if ($first >= 100)
    {
        echo "Votre nombre est trop grand $first > 100";
        exit (1);
    }
    echo "<table border = '1'>\n";
    echo "<tr><th>Number</th><th>Square</th><th>Cube</th></tr>";
    for($i=1; $i<=$first; $i++)
    {
        $square = $i * $i;
        $cube = $i * $i * $i;
        print("<tr><td>$i</td><td>$square</td><td>$cube</td></tr>\n");
    }
    echo "</table>\n";
?>