<?php

session_start();

include_once "bd/UsuariosBD.php";

$mensaje = "";
$nombre = "";
$apellido = "";
$clave = "";

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

    $usuarioBD = new UsuariosBD();
    $usuario = $usuarioBD->login($nombre,$apellido,$clave);
    if($usuario == null){
        $mensaje = "ERROR: Usuario / Clave no coinciden.";
    }
    else{
        //iniciar sesión
        $_SESSION['usuario'] = serialize($usuario);
        
        
        header ("Location: bienvenido.php");
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
                <div class="col">
                    <h1>Bienvenido a la Escuelita</h1>
                </div>
            </div>
            <div class="jumbotron">
                <div class="row">
                    <div class="col alert-info">
                        Para comenzar por favor ingrese sus datos e inicie sesión.
                    </div>
                </div>
                <div class="row">
                    <div class="col alert-danger">
                        <?php echo $mensaje; ?>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <br/>
                    </div>
                </div>
                <form action="index.php" method="POST">
                    <div class="row">
                        <div class="col">
                            Nombre:
                        </div>
                        <div class="col">
                            <input type="text" name="nombre" class="form-control">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col">
                            Apellido:
                        </div>
                        <div class="col">
                            <input type="text" name="apellido" class="form-control">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col">
                            Clave:
                        </div>
                        <div class="col">
                            <input type="password" name="clave" class="form-control">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col">
                            <input type="submit" name="aceptar" value="Aceptar" class="btn btn-success">
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </body> 
</html>