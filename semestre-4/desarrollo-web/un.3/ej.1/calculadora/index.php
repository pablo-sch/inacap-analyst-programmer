<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>CALCULADORA</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <link rel="stylesheet" href="css/estilos.css">
    </head>
    <body>
        <form action="resultado.php" method="POST">
            <div class="container">
                <div class="row">
                    <div class="col">Número 1:</div>
                    <div class="col"><input name="numero1" id="numero1" class="form-control"></div>
                </div>
                <div class="row">
                    <div class="col">Número 2:</div>
                    <div class="col"><input name="numero2" id="numero2" class="form-control"></div>
                </div>
                <div class="row">
                    <div class="col">Operación:</div>
                    <div class="col">
                        <select name="operacion" id="operacion" class="form-control">
                            <option value="+">SUMAR</option>
                            <option value="-">RESTAR</option>
                            <option value="*">MULTIPLICAR</option>
                            <option value="/">DIVIDIR</option>
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <input type="submit" id="operar" value="OPERAR" class="btn btn-primary">
                    </div>
                </div>
            </div>
        </form>
        <script>
        $(document).ready(function(e){
            $('#operar').click(function(e){
                var validoNum1 = validarNum1();
                var validoNum2 = validarNum2();
                //si valida lanzo un true, si no valida lanzo un false
                return validoNum1 && validoNum2;
            });
            
            $('#numero1').focusout(function(e){
                validarNum1();
            });
            $('#numero2').focusout(function(e){
                validarNum2();
            });
            
            function validarNum1(){
                var numero1 = $('#numero1').val();
                if(numero1.length == 0){
                    $('#numero1').addClass('error');
                    $('#numero1').removeClass('exito');
                    return false;
                }
                else{
                    if(isNaN(numero1)){
                        $('#numero1').addClass('error');
                        $('#numero1').removeClass('exito');
                        return false;
                    }
                    else{
                        $('#numero1').addClass('exito');
                        $('#numero1').removeClass('error');
                        return true;
                    }
                }
            }
            
            function validarNum2(){
                var numero2 = $('#numero2').val();
                if(numero2.length == 0){
                    $('#numero2').addClass('error');
                    $('#numero2').removeClass('exito');
                    return false;
                }
                else{
                    if(isNaN(numero2)){
                        $('#numero2').addClass('error');
                        $('#numero2').removeClass('exito');
                        return false;
                    }
                    else{
                        var operacion = $('#operacion').val();
                        if(operacion == '/' && numero2 == '0'){
                            $('#numero2').addClass('error');
                            $('#numero2').removeClass('exito');
                            return false;
                        }
                        else{
                            $('#numero2').addClass('exito');
                            $('#numero2').removeClass('error');
                            return true;
                        }
                    }
                }
            }
        });
        </script>
    </body>
</html>
