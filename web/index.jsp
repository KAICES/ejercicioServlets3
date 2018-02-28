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
        <h1>TALLER SERVLET</h1>
        <form action="ServletEjercicio" method="POST">
            Nombre:<br>
            <input type ="text" name="nombre"></input><br>
            <br>
            Edad<br>
            <input type ="text" name="edad"></input><br>
            <br>
            Carrera<br><br>
            <select name="Carrera">
            	<option value="0">Seleccione Carrera</option>
                <option value="1">Administracion de empresas</option>
                <option value="2">Ingenieria de sistemas</option>
                <option value="3">Matematicas</option><br>           
            </select> <br><br>
            Ingreso mensual: <br><br>
            <input type ="text" name="ingreso mensual"></input>
            <br>            
            <br>
            <input type="submit" />            
        </form>
    </body>
</html>