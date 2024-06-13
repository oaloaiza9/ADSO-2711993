<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['cedula']) and !empty($_POST['nombres']) and !empty($_POST['apellidos']) ) {

        $documento = $_POST['cedula'];
        $nombres = $_POST['nombres'];
        $apellidos = $_POST['apellidos'];
        $telefono = $_POST['telefono'];
        $direccion = $_POST['direccion'];
        $email = $_POST['email'];

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO personas (cedula, nombres, apellidos, telefono, direccion, email) VALUES(:doc, :nom, :ape, :tel, :dir, :ema) ");
            $consulta->bindParam(':doc', $documento);
            $consulta->bindParam(':nom', $nombres);
            $consulta->bindParam(':ape', $apellidos);
            $consulta->bindParam(':tel', $telefono);
            $consulta->bindParam(':dir', $direccion);
            $consulta->bindParam(':ema', $email);
            $proceso = $consulta->execute();

            if( $proceso && $consulta->rowCount()!=0){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##PERSON##INSERT"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##PERSON##INSERT"
                              ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = [
                            'status' => false,
                            'mesagge' => "ERROR##SQL",
                            'exception' => $e
                          ];
            echo json_encode($respuesta);
        }
    }else{
        $respuesta = [
                        'status' => false,
                        'mesagge' => "ERROR##DATOS##POST"
                      ];
        echo json_encode($respuesta);
    }
?>
