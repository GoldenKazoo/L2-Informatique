<?php
namespace App\Http\Controllers;
use App\Http\Controllers\Controller;
use Illuminate\Support\Facades\DB;
use Illuminate\Http\Request;
class TestController extends Controller{
public function affiche($id='defaut') {
return view('affiche', ['id'=> $id]);
}
public function afficheProduits(){
return view('commandes');
}
public function executeFormulairePost(Request $request){
$nom = $request -> get('nom');
$adresse = $request -> get('adresse');
$tel= $request -> get('tel');
return view('executeForm', ['nom'=>$nom,'adresse'=>$adresse,'tel'=>$tel]);
} }