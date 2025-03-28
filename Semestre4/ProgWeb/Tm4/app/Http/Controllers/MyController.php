<?php
namespace App\Http\Controllers;
use App\Http\Controllers\Controller;
use Illuminate\Support\Facades\DB;
use Illuminate\Http\Request;

class MyController extends Controller
{
    public function affiche($id='defaut')
    {
        return view('affiche', ['id'=> $id]);
    }

    public function affich_form()
    {
        return view('formulaire');
    }

    public function execute_form(Request $request)
    {
        $val = $request -> get('v1');
        return view('resultat_formulaire', ['val' => $val]);
    }
}