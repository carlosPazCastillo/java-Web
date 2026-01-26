<%-- 
    Document   : index
    Created on : 14 ene 2026, 16:32:50
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carloss</title>
    </head>
    <body>
        <h1>Carga Datos de Usuario</h1>
        <form action="svUsuario" method="POST">
            <p> <label>DNI</label> <input type="text" name="dni"> </p>
            <p> <label>NOMBRE</label> <input type="text" name="nombre"> </p>
            <p> <label>APELLIDO</label> <input type="text" name="apellido"> </p>
            <p> <label>TELEFONO</label> <input type="text" name="telefono"> </p>
            <button type="submit">Enviar</button>
        </form>
        
        <h1>Ver Lista de usuarios</h1>
        <p>Haga click en el botón para ver todos los usuarios</p>
        <form action="svUsuario" method="GET">
            <button type="submit">Traer Usuarios</button>
        </form>
        
    </body>
</html>
