<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Relations\Pivot;

class CommandePizza extends Pivot
{
    use HasFactory;

    protected $table = 'commande_pizza';

    protected $fillable = [
        'commande_id', 'pizza_id', 'quantity'
    ];
}

