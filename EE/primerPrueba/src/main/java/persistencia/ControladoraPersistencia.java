/**
 * Centraliza todas las peticiones que se requieran
 * hacia la base de datos por medio de JPA
 * para cumplir con el modelo de capas
 * 
 * */
package persistencia;

import java.util.List;
import logica.Usuario;

public class ControladoraPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    
    // CREATE
    public void crearUsuario(Usuario usu){
        usuJpa.create(usu);
    }
    
    // READ
    public List<Usuario> traerUsuarios(){
        return usuJpa.findUsuarioEntities();
    }
    
    // UPDATE
    
    // DELETE
}
