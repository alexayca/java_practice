/*
 * 
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Usuario;

/**
 *
 * @author alexa
 */
@WebServlet(name = "SvEditUsuarios", urlPatterns = {"/SvEditUsuarios"})
public class SvEditUsuarios extends HttpServlet {
    
    Controladora control = new Controladora();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // obtenemos el id enviado por el formulario
       int id = Integer.parseInt(request.getParameter("id"));
       // buscar en DB
        Usuario usuario = control.traerUsuario(id);
        // asignamos los valores a las sesion
        HttpSession misesion = request.getSession();
        misesion.setAttribute("usuarioEditar", usuario);
        System.out.println("Peticion GET para editar usuario: "+ usuario.getNombre_usuario());
        response.sendRedirect("editarusuarios.jsp");
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombreUsuario = request.getParameter("usuarioname");
        String contra = request.getParameter("password");
        String rol = request.getParameter("rol");
        
        Usuario usuario = (Usuario)request.getSession().getAttribute("usuarioEditar");
        System.out.println("Peticion POST para cambiar al usuario: " +nombreUsuario+"|"+ usuario.getNombre_usuario());
        
        usuario.setNombre_usuario(nombreUsuario);
        usuario.setPassword(contra);
        usuario.setRol(rol);
        
        control.editarUsuario(usuario);
        
        //response.sendRedirect("verusuarios.jsp"); // se muestran los datos sin modificar
        response.sendRedirect("SvUsuarios");
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
