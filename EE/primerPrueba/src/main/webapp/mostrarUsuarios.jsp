<%-- 
Archivo guardado en: 
/{proyecto}/Web Pages/mostrarUsuarios.jsp
--%>

<%@page import="java.util.List"%>
<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Usuarios</title>
    </head>
    <body>
        <h1>Lista de usuarios registrados</h1>
        
        <%
            List<Usuario> listaUsuarios = (List)request.getSession().getAttribute("listaUsuariosA");
            int cont = 1;
            for(Usuario user : listaUsuarios){
            %>
                <p><b>Usuario: <%=cont%></b></p>
                <% cont++; %>
                <p>DNI: <%= user.getDni()%></p>
                <p>Nombre: <%= user.getNombre()%></p>
                <p>Apellidos: <%= user.getApellido()%></p>
                <p>ITelefono: <%= user.getTelefono()%></p>
                <p>--------------------------------------</p>
            <%}%>
        
    </body>
</html>
