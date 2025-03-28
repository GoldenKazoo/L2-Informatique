<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateCommandePizzaTable extends Migration
{
    public function up()
    {
        Schema::create('commande_pizza', function (Blueprint $table) {
            $table->id();
            $table->foreignId('commande_id')->constrained()->onDelete('cascade');
            $table->foreignId('pizza_id')->constrained()->onDelete('cascade');
            $table->integer('quantity');
            $table->timestamps();
        });
    }

    public function down()
    {
        Schema::dropIfExists('commande_pizza');
    }
}
