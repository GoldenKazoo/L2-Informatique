<?php
echo "<table border = '1'>\n";
echo "<tr><th>Fr</th><th>En</th></tr>";
$tableau = array
(
    array("French" => "Lundi", "English" => "Monday"),
    array("French" => "Mardi", "English" => "Thuesday"),
    array("French" => "Mercredi", "English" => "Wednesday"),
    array("French" => "Jeudi", "English" => "Thursday"),
    array("French" => "Vendredi", "English" => "Friday"),
    array("French" => "Samedi", "English" => "Saturday"),
    array("French" => "Dimanche", "English" => "Sunday"),
);

foreach ($tableau as $line) {
    echo "<tr>";
    echo "<td>" . $line['French'] . "</td>";
    echo "<td>" . $line['English'] . "</td>";
    echo "</tr>";
}
?>