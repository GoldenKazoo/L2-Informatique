<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Client extends Model
{
    use HasFactory;

    protected $fillable = [
        'first_name', 'last_name', 'phone', 'email', 'address', 'zip_code', 'intercom', 'entry_code', 'floor'
    ];

    public function commandes()
    {
        return $this->hasMany(Commande::class);
    }
}

