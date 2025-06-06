<?php



$numero1 = 0;
if(isset($_POST['numero1'])){
    $numero1 = $_POST['numero1'];
}
$numero2 = 0;
if(isset($_POST['numero2'])){
    $numero2 = $_POST['numero2'];
}
$operacion = "";
if(isset($_POST['operacion'])){
    $operacion = $_POST['operacion'];
}

$resultado = 0;
$nombreOperacion = "";
if($operacion == "+"){
    $resultado = $numero1+$numero2;
    $nombreOperacion = "SUMAR";
}
if($operacion == "-"){
    $resultado = $numero1-$numero2;
    $nombreOperacion = "RESTAR";
}
if($operacion == "*"){
    $resultado = $numero1*$numero2;
    $nombreOperacion = "MULTIPLICAR";
}
if($operacion == "/"){
    $resultado = $numero1/$numero2;
    $nombreOperacion = "DIVIDIR";
}

echo "El resultado de ".$nombreOperacion." ".$numero1." y ".$numero2." es ".$resultado;