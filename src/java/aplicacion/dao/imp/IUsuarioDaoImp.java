package aplicacion.dao.imp;

import aplicacion.dao.IUsuarioDao;
import aplicacion.modelo.dominio.Usuario;
import aplicacion.modelo.util.ListadoUsuario;

/**
 * Clase Dao de implementacion
 *
 * @author GRUPO10
 */
public class IUsuarioDaoImp implements IUsuarioDao {

    @Override
    /**
     * metodo para validar un Usuario usando la lista de usuarios precargados
     * igualmente controla la existencia del password o contraseña
     */
    public Usuario validarUsuario(String nombreUsuario, String password) {
        Usuario u = null;
        boolean existe = false;
        for (int i = 0; i < ListadoUsuario.listadoUsuarios.length && existe == false; i++) {
            Usuario usuarioDeListado = ListadoUsuario.listadoUsuarios[i];
            if (usuarioDeListado != null && usuarioDeListado.getNombreUsuario().equals(nombreUsuario)
                    && usuarioDeListado.getPassword().equals(password)) {
                u = usuarioDeListado;
                existe = true;
            }
        }
        return u;
    }

    @Override
    /**
     * metodo para modificacion de Usuario
     */
    public void modificar(Usuario unUsuario) {
        boolean existe = false;
        for (int i = 0; i < ListadoUsuario.listadoUsuarios.length && existe != true; i++) {
            Usuario usuarioDelListado = ListadoUsuario.listadoUsuarios[i];
            if (usuarioDelListado.getNombreUsuario().equals(unUsuario.getNombreUsuario())) {
                ListadoUsuario.listadoUsuarios[i] = unUsuario;
                existe = true;
            }
        }
    }

    @Override
    /**
     * metodo para la obtencion y/o visualizacion de un Usuario mediante el uso
     * de la lista de estos
     */
    public Usuario obtenerUsuario(String nombreUsuario) {
        Usuario u = null;
        boolean existe = false;
        for (int i = 0; i < ListadoUsuario.listadoUsuarios.length && existe == false; i++) {
            Usuario usuarioDeListado = ListadoUsuario.listadoUsuarios[i];
            if (usuarioDeListado != null && usuarioDeListado.getNombreUsuario().equals(nombreUsuario)) {
                u = usuarioDeListado;
                existe = true;
            }
        }
        return u;
    }

    @Override
    /**
     * metodo para la creacion de un Usuario
     */
    public void crear(Usuario unUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
