/*
 * 
 */
package logica;

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
    
}
