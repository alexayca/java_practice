<%--
--%>
<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/head.jsp" %>
<%@include file="components/bodyhead.jsp" %>

<h1>Editar Usuario</h1>
<p>Modificar datos de un usuario del sistema</p>

<% Usuario user = (Usuario)request.getSession().getAttribute("usuarioEditar"); %>

<form class="user" action="SvEditUsuarios" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="usuarioname" name="usuarioname"
                   placeholder="Nombre de usuario" value="<%= user.getNombre_usuario()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="password" name="password"
                placeholder="Password" value="<%= user.getPassword() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rol" name="rol"
                placeholder="Rol" value="<%= user.getRol() %>">
        </div>
    </div>

    <button type="submit" class="btn btn-primary btn-user btn-block">
        Guardar cambios
    </button>
    <hr>

</form>

<%@include file="components/footer.jsp" %>
<%@include file="components/bodyfooter.jsp" %>