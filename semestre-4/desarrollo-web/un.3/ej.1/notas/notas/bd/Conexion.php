<?php

class Conexion{

    public $servidor = "localhost";
    public $basedatos = "notas";
    public $usuario = "root";
    public $clave = "";

    public $enlace = null;

    public function conectar(){
        $this->enlace = new mysqli($this->servidor, $this->usuario, $this->clave, $this->basedatos);
        if ($this->enlace->connect_errno) {
            die ("Fallo al conectar a MySQL: (" . $this->enlace->connect_errno . ") " . $this->enlace->connect_error);
        }
    }

    public function desconectar(){
        $this->enlace->close();
    }
}