/**
 * Centraliza todas las peticiones que se requieran
 * hacia la base de datos por medio de JPA
 * para cumplir con el modelo de capas
 * 
 * */
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;

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
    public void borrarUsuario(int id_eliminar) {
        try {
            usuJpa.destroy(id_eliminar);
        } catch (NonexistentEntityException e) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }

    public Usuario traerUsuario(int id_editar) {
        return usuJpa.findUsuario(id_editar);
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
