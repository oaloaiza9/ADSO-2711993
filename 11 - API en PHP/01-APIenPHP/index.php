<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Una API para la gestión de personas, donde se pueden realizar las acciones de obtener, insertar, actualizar y eliminar.">
    <title>API de Gestión de Personas</title>
    <link rel="icon" type="image/x-icon" href="WEB/img/icono_api.png">
    <link rel="stylesheet" href="WEB/css/styles.css">
</head>
<body>
    <div class="container">
        <h1>API de Gestión de Personas</h1>
        <ul id="endpoint-list">

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/Obtener.php">API/Obtener.php</a> </span></h4>
        		<h5>Metodo: GET</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
        			<li></li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Lista de personas:</h5>
					<pre>&nbsp;&nbsp;[<br>&nbsp;&nbsp;&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"cedula": "108800",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"nombres": "OSCAR ANDRES",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"apellidos": "LOAIZA PABON",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"telefono": "3333333",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"direccion": "CALLE 20",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"email": "oscar@mail.com",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"foto": "default.png"<br>&nbsp;&nbsp;&nbsp;&nbsp;},<br>&nbsp;&nbsp;&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"cedula": "108801",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"nombres": "JUAN DANIEL",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"apellidos": "GARCIA PEREZ",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"telefono": "3333331",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"direccion": "CALLE 21",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"email": "juan@mail.com",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"foto": "default.png"<br>&nbsp;&nbsp;&nbsp;&nbsp;}<br>&nbsp;&nbsp;]</pre>
        		</div>
        	</li>

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/Insertar.php">API/Insertar.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
        			<li><i><b>int</b></i> cedula</li>
					<li><i><b>String</b></i> nombres</li>
					<li><i><b>String</b></i> apellidos</li>
					<li><i><b>String</b></i> telefono</li>
					<li><i><b>String</b></i> direccion</li>
					<li><i><b>String</b></i> email</li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Persona actualizada:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##PERSON##INSERT"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en actualizacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##PERSON##INSERT"<br>&nbsp;&nbsp;}</pre>
        		</div>
        	</li>

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/Actualizar.php">API/Actualizar.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
        			<li><i><b>int</b></i> cedula</li>
					<li><i><b>String</b></i> nombres</li>
					<li><i><b>String</b></i> apellidos</li>
					<li><i><b>String</b></i> telefono</li>
					<li><i><b>String</b></i> direccion</li>
					<li><i><b>String</b></i> email</li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Persona actualizada:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##PERSON##UPDATE"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en actualizacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##PERSON##UPDATE"<br>&nbsp;&nbsp;}</pre>
        		</div>
        	</li>

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/Eliminar.php">API/Eliminar.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
        			<li><i><b>int</b></i> cedula</li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Persona eliminada:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##DELETE"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en eliminacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DELETE"<br>&nbsp;&nbsp;}</pre>
        		</div>
        	</li>
        </ul>
    </div>

    <script src="WEB/js/script.js"></script>
</body>
</html>

