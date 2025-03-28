<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Commande extends Model
{
    use HasFactory;

    protected $fillable = [
        'client_id', 'livreur_id', 'status'
    ];

    public function client()
    {
        return $this->belongsTo(Client::class);
    }

    public function livreur()
    {
        return $this->belongsTo(Livreur::class);
    }

    public function pizzas()
    {
        return $this->belongsToMany(Pizza::class, 'commande_pizza')->withPivot('quantity');
    }
}
