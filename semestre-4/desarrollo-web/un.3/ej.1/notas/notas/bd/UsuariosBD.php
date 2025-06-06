<?php

include_once "Conexion.php";
include_once "Usuarios.php";

class UsuariosBD {
    
    public function login($nombre,$apellido,$clave){
        $conexion = new Conexion();
        $conexion->conectar();

        $sql = "SELECT * FROM usuarios where nombre = ? and apellido = ? and clave = ? ";
        $sentencia = $conexion->enlace->prepare($sql);
        $sentencia->bind_param("sss", $nombre, $apellido, $clave);
        $sentencia->execute();
        $filas = $sentencia->get_result();
        $usuario = null;
        if ($filas->num_rows > 0) {
            while($fila = $filas->fetch_assoc()) {
                $usuario = new Usuarios();
                $usuario->id = $fila['id'];
                $usuario->nombre = $fila['nombre'];
                $usuario->apellido = $fila['apellido'];
                $usuario->clave = $fila['clave'];
                $usuario->perfil = $fila['perfil'];                
            }
        }

        $conexion->desconectar();
        return $usuario;
    }

    public function nuevo(){

    }

    public function buscar(){

    }

    public function editar(){

    }

    public function listar(){
        
    }

    public function eliminar(){

    }

}
