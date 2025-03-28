<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\MyController;
use App\Http\Controllers\MyPosts;

Route::get('/', function () {
    return view('home');
});

Route::get('/page_affiche/{id}', [MyController::class, 'affiche']);

Route::get('/formulaire', [MyController::Class, 'affich_form']);
Route::get('/blog', [MyPosts::class, 'createPost']);
// Route::post('/result', [MyController::class, 'execute_form']) -> name('form:action');
Route :: get ('/fakebook', function() 
{
    return view('fakebook');
});
Route :: post ('/fakebook', [MyPosts :: class, 'affichePost'])-> name('form:action');
