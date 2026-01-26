<%-- 
    Document   : mostrarUsuarios
    Created on : 16 ene 2026, 10:56:32
    Author     : Usuario
--%>

<%@page import="java.util.List"%>
<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Muestra de Usuarios</title>
    </head>
    <body>
        <h1>Lista de Usuarios Registrados</h1>
        
        <%
            List<Usuario> usuarios = (List) request.getSession().getAttribute("usuarios");
            int cont = 1;
            for(Usuario user : usuarios){
        %>
        
        <p><b>Usuario N°<%= cont%></b></p>
        <p>Dni: <%= user.getDni() %></p>
        <p>Nombre: <%= user.getNombre() %></p>
        <p>Apellido <%= user.getApellido() %></p>
        <p>Telefono <%= user.getTelefono() %></p>
        <p>---------------------------------------</p>
        <%cont = cont +1;%>
        
        <%}%>
    </body>
</html>
