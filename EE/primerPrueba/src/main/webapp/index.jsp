<%-- 
    Document   : index
    Created on : june/2024
Archivo guardado en: 
/{proyecto}/Web Pages/index.jsp

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Formulario Page</title>
    </head>
    <body>
        <h1>Hola mundo desde HTML</h1>
        <%String hola = "Hola mundo desde Java";%>
        <%= hola %>
        
        
        <h1>Datos del cliente</h1>
        <%-- Se envia al servlet de usuarios --%>
        <form action="SvUsuarios" method="POST">
            <p><label>DNI</label><input type="text" name="dni"></p>
            <p><label>Nombre:</label><input type="text" name="nombre"></p>
            <p><label>Apellido:</label><input type="text" name="apellido"></p>
            <p><label>Telefono:</label><input type="text" name="telefono"></p>
            <button type="submit">Enviar</button>
        </form>
        
        
        <h1>Ver lista de usuarios</h1>
        <form action="SvUsuarios" method="GET">
            <button type="submit">Consultar</button>
        </form>
        
        
                <h1>Eliminar usuarios</h1>
                <p>Ingrese la Id del usuario que quiere eliminar</p>
        <form action="SvUsuarios" method="POST">
            <p><label>Id: </label><input type="text" name="id_usuario"></p>
            <button type="submit">Eliminar Usuario</button>
        </form>
        
    </body>
</html>
