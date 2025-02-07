<?php
$day = "Madi";
$truth = 0;
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

try
{
    foreach ($tableau as $line)
    {
        if ($line['French'] == $day)
        {
            echo "Today is " . $line['English'];
            exit(1);
        }
    }
    echo "Value not set";
    throw new Exception("value not set");
}
catch(Execption $e)
{
    exit($e->getMessage());
}
