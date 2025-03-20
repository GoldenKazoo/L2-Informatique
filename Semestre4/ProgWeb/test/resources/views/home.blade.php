 <!DOCTYPE html>
<html lang="en">
<head>
  <title>Fake </title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<style>
    .bg-dark
{
    background-color: #343a40 !important;
}
.text-white
{
    color: #ffffff !important;
}
</style>
<body>

<div class="container bg-dark text-white">
    <div class="row">
        <div class="col-sm-12 text-center">
            <h1>My Fake Market</h1>
        </div>
    </div>
</div>

<div class="container d-flex justify-content-center">
    <div class="row">
        <form action="{{route('form:action')}}" method="get">
            Nom:<br>
            <input type="text" name = "nom"><br>
            Adresse:<br>
            <input type="text" name = "adresse"><br>
            Telephone:<br>
            <input type="text" name = "tel"><br>
            Envoyer:<br>
        <input type="submit" value="Send"><br>
        </form>
        </div>
    </div>
    <div class="container d-flex justify-content-center">
    <div class="row">
        <form action="{{route('affiche:produits')}}" method="get">
            Envie d'une commande ?<br>
            <input type="submit" value="Voir nos produits"><br>
        </form>
        </div>
    </div>
</body>
</html> 