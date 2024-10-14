<%--
--%>
<%@page import="java.util.List"%>
<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/head.jsp" %>
<%@include file="components/bodyhead.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Ver usuarios</h1>
    <p class="mb-4">Lista completa de usuarios.</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Usuarios</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre de Usuario</th>
                            <th>Rol</th>
                            <th style="width: 210px">Acción</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>ID</th>
                            <th>Nombre de Usuario</th>
                            <th>Rol</th>
                            <th style="width: 210px">Acción</th>
                        </tr>
                    </tfoot>
                    <%  
                        List<Usuario> listaUsuarios = (List)request.getSession().getAttribute("listaUsuarios");
                    %>
                    <tbody>
                        <% for(Usuario user:listaUsuarios){ %>
                        <tr>
                            <td id="id_user<%=user.getId_usuario()%>"><%= user.getId_usuario() %></td> <!-- ID heredado -->
                            <td><%= user.getNombre_usuario() %></td>
                            <td><%= user.getRol() %></td>
                            <td style="display:flex; width:230px">
                                <form name="eliminar" action="SvEliminarUsuarios" method="POST"> <!-- para mandar el codigo al servlet -->
                                            <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:red; margin-right: 5px; "> 
                                              <i class="fas fa-trash-alt"></i>  Eliminar
                                            </button>
                                            <input type="hidden" name="id" value="<%= user.getId_usuario()%>"> <!-- manda el id a eliminar al servlet -->
                                </form>  
                                <form name="editar" action="SvEditUsuarios" method="GET"> <!-- esto es para mandar el codigo al servlet -->
                                            <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-left: 5px;"> 
                                              <i class="fas fa-pencil-alt"></i>  Editar
                                            </button>
                                            <input type="hidden" name="id" value="<%= user.getId_usuario()%>"> <!-- mandar el id para editar al servlet -->
                                </form>  
                            </td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->

</div>
<!-- End of Main Content -->



<%@include file="components/footer.jsp" %>
<%@include file="components/bodyfooter.jsp" %>