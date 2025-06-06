<?php
session_start();

include_once 'bd/Usuarios.php';

$nombre = "";
$apellido = "";
$perfil = "";

if(isset($_SESSION['usuario'])){
    $usuario = unserialize($_SESSION['usuario']);
}

if($usuario->perfil != "PROFESOR"){
    header("Location: index.php");
}
echo "Hola, yo me llamo ".$usuario->nombre." ".$usuario->apellido." y soy un ".$usuario->perfil;
echo "<br/>";
echo "<a href='cerrar.php'>Cerrar la sesión</a>";

