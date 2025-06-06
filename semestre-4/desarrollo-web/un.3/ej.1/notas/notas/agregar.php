<?php
include_once "bd/UsuariosBD.php";

$nombre = "";
$apellido = "";
$clave = "";
$perfil = "";

if(isset($_POST['aceptar'])){
    if(isset($_POST['nombre'])){
        $nombre = $_POST['nombre'];
    }
    if(isset($_POST['apellido'])){
        $apellido = $_POST['apellido'];
    }
    if(isset($_POST['clave'])){
        $clave = $_POST['clave'];
    }
    if(isset($_POST['perfil'])){
        $perfil = $_POST['perfil'];
    }

    if($nombre != "" && $apellido != "" && $clave != "" && $perfil != ""){
        $usuarioBD = new UsuariosBD();
        $usuarioBD->nuevo($nombre,$apellido,$clave,$perfil);
    }
}

?>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" href="css/estilos.css">
        <script
            src="https://code.jquery.com/jquery-3.4.1.min.js"
            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
            crossorigin="anonymous"></script>

        <script>
        </script>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col">Agregar un usuario a BD:</div>
            </div>
            <form action="agregar.php" method="POST">
                <div class="row">
                    <div class="col">Nombre:</div>
                    <div class="col">
                        <input type="text" name="nombre" class="form-control">
                    </div>
                </div>
                <div class="row">
                    <div class="col">Apellido:</div>
                    <div class="col">
                        <input type="text" name="apellido" class="form-control">
                    </div>
                </div>
                <div class="row">
                    <div class="col">Clave:</div>
                    <div class="col">
                        <input type="password" name="clave" class="form-control">
                    </div>
                </div>
                <div class="row"> 
                    <div class="col">Perfil:</div>
                    <div class="col">
                        <select name="perfil" class="form-control">
                            <option value="PROFESOR">PROFESOR</option>
                            <option value="ALUMNO">ALUMNO</option>
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <input name="aceptar" type="submit" value="Aceptar" class="btn btn-success">
                    </div>
                </div>
            </form>
        </div>
    </body> 
</html>