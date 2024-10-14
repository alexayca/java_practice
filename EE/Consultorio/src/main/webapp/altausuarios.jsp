<%--
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/head.jsp" %>
<%@include file="components/bodyhead.jsp" %>

<h1>Alta Usuarios</h1>
<p>Alta de usuarios del sistema</p>

<form class="user" action="SvUsuarios" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="usuario" name="usuario"
                placeholder="Nombre de usuario">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="password" name="password"
                placeholder="Password">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rol" name="rol"
                placeholder="Rol">
        </div>
    </div>

    <button type="submit" class="btn btn-primary btn-user btn-block">
        Crear Usuario
    </button>
    <hr>

</form>

<%@include file="components/footer.jsp" %>
<%@include file="components/bodyfooter.jsp" %>