<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="{{route('form:action')}} method="post>
        Titre
        <input type="text" name="title" >
        Long Text
        <input type="text" name="longtext" >
        <input type='submit' value='Envoyer'>
        @csrf
</form>
</body>
</html>