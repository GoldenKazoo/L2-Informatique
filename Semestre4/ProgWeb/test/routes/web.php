<?php

use Illuminate\Support\Facades\Routes;
use App\Http\Controllers\TestController;
Route::get('/', function () { return view('home'); });
Route::get('/x', [TestController::class, 'afficheProduits']) -> name('affiche:produits');
Route::get('/y', [TestController::class, 'executeFormulairePost'])-> name('form:action');
