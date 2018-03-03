<%-- 
    Document   : index
    Created on : 27/02/2018, 06:57:09 PM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Taller</title>
    </head>
    <body>

		<div>
			<h4></h4>
		</div>
        <h1>TALLER SERVLET</h1>
        <form action="ServletPersona" method="POST">
            Nombre:<br>
            <input type ="text" name="nombre"></input><br>
            <br>
            Edad<br>
            <input type ="text" name="edad" onblur="validarEdad(event)"></input><br>
            <br>
            Carrera<br><br>
            <select name="carrera" >
            	<option >Seleccione Carrera</option>
                <option value="1">Administracion de empresas</option>
                <option value="2">Ingenieria de sistemas</option>
                <option value="3">Matematicas</option><br>
			</select> <br><br>
			<div id="ingresoMes" style="display: none">
				Ingreso mensual: <br><br>
				<input type ="text" name="ingresoMensual" ></input>
			</div>
            <br>
            <br>
            <input type="submit" value="Enviar" />
		</form>
		<script>
			function validarEdad(e) {
				var edad = e.target;
				var ingresoMes = document.getElementById('ingresoMes');
				if (edad.value > 21) {
					ingresoMes.style.display = 'block';
				}
			}
		</script>
    </body>
</html>