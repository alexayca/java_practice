<%--
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/head.jsp" %>
<%@include file="components/bodyhead.jsp" %>

<h1>Alta Odontologos</h1>
<p>Introduzca sus datos</p>

<form class="user">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="dni"
                placeholder="DNI">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre"
                placeholder="Nombre">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="apellido"
                placeholder="Apellido">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="telefono"
                placeholder="Telefono">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="direccion"
                placeholder="Direccion">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nacimiento"
                placeholder="Fecha de nacimiento">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="especialidad"
                placeholder="Especialidad">
        </div>

        <!-- Usuarios y horarios -->
        
    </div>

    <a href="" class="btn btn-primary btn-user btn-block">
        Crear Odontologo
    </a>
    <hr>

</form>

<%@include file="components/footer.jsp" %>
<%@include file="components/bodyfooter.jsp" %>