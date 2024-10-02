/*
 * 
 */
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author alexa
 */
public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public Controladora() {
    }
    
    public void crearUsuario(String nombreUsuario, String password, String rol){
        Usuario user = new Usuario();
        user.setNombre_usuario(nombreUsuario);
        user.setPassword(password);
        user.setRol(rol);
        controlPersis.crearUsuario(user);
        
    }

    public List<Usuario> getUsuarios() {
        return controlPersis.getUsuarios();
    }

    public void borrarUsuario(int id) {
        controlPersis.borrarUsuario(id);
    }

    public Usuario traerUsuario(int id) {
        return controlPersis.traerUsuario(id);
    }

    public void editarUsuario(Usuario usuario) {
        controlPersis.editarUsuario(usuario);
    }
    
}
