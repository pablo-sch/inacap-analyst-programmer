<html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" href="css/estilos.css">
    </head>
    <body>
        <div class="container">
            <?php
            for ($i = 1; $i <= 100; $i++) {
                echo("<div class='row'>");
                for ($j = 1; $j <= 10; $j++) {
                    $valor = $i * $j;
                    if ($valor % 2 == 0) {
                        echo("<div class='col amarillo'>" . $valor . "</div>");
                    } else {
                        echo("<div class='col verde'>" . $valor . "</div>");
                    }
                }
                echo ("</div>");
            }
            ?>  
        </div>

    </body>
</html>
