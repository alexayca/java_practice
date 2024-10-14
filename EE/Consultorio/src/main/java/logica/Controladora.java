/*
 * 
 */
package logica;

import java.util.ArrayList;
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

    public boolean comprobarIngreso(String usuario, String password) {
        boolean ingreso = false;
        // traemos todos los usuarios, despues buscamos el usuario y comparamos su contraseña, aunque no es lo mas eficiente
        // considere que la contraseña no esta encriptada
        List <Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios = controlPersis.getUsuarios();
        System.out.println(usuario+"|"+password);
        
        for (Usuario usu : listaUsuarios) {
            if(usu.getNombre_usuario().equals(usuario)){
                System.out.print("Usuario correcto. ");
                if (usu.getPassword().equals(password)){
                    ingreso = true;
                    System.out.print("Password correcto. ");
                }
            }
        }
        return ingreso;
    }
    
}
