<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
</head>
<body>
<?php
$square = 0;
$cube = 0;
echo "<table border = '1'>\n";
echo "<tr><th>Number</th><th>Square</th><th>Cube</th></tr>";
for($i=1; $i<21; $i++)
{
    $square = $i * $i;
    $cube = $i * $i * $i;
    print("<tr><td>$i</td><td>$square</td><td>$cube</td></tr>\n");
}

echo "</table>\n";
?>

