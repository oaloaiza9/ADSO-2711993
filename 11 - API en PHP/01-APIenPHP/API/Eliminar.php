<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['cedula'])) {
        
        $documento = $_POST['cedula'];
        
        try {
            $consulta = $base_de_datos->prepare("DELETE FROM personas WHERE cedula = :doc ");

            $consulta->bindParam(':doc', $documento);
            $proceso = $consulta->execute();

            if( $proceso && $consulta->rowCount()!=0){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##DELETE"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##DELETE"
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
