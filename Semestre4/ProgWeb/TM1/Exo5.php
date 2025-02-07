<?php

class Monster
{
    private $name;
    private $catch_phrase;

    public function __construct($name, $catch_phrase)
    {
        $this->name = $name;
        $this->catch_phrase = $catch_phrase;
    }
    public function get_name()
    {
        return ($this->name);
    }

    public function get_catch_phrase()
    {
        return ($this->catch_phrase);
    }

    public function set_name ($name)
    {
        $this->name = $catch_phrase;
    }

    public function set_catch_phrase ($catch_phrase)
    {
        $this->catch_phrase = $catch_phrase;
    }

}

$dracula = new Monster ("Dracula", "je vais te mordre");

echo "Graouuu je suis " . $dracula->get_name() . ", " . $dracula->get_catch_phrase();



