<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Pizza extends Model
{
    use HasFactory;

    protected $fillable = [
        'name', 'description', 'price'
    ];

    public function commandes()
    {
        return $this->belongsToMany(Commande::class, 'commande_pizza')->withPivot('quantity');
    }
}

