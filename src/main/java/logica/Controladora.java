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
    
    public void crearUsuario(int id, String nombreUsuario, String password, String rol){
        Usuario user = new Usuario(id, nombreUsuario, password, rol);
        controlPersis.crearUsuario(user);
        
    }
    
}
