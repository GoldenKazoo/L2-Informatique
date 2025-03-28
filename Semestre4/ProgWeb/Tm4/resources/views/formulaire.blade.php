@extends('template')
@section('titre', 'Formulaire')
@section('content')
<form action="{{route('form:action')}}" method="post">
    <p> Insert a value </p>
    <input type="text" name="v1">
    <input type="submit" value="Send">
    @csrf
</form>
@endsection 