package aplicacion.dao.imp;

import aplicacion.dao.IUsuarioDao;
import aplicacion.modelo.dominio.Doctor;
import aplicacion.modelo.util.ListadoUsuario;

/**
 * Clase Dao de implementacion
 *
 * @author GRUPO10
 */
public class UsuarioDaoImp implements IUsuarioDao {

    @Override
    /**
     * metodo para validar un Usuario usando la lista de usuarios precargados
     * igualmente controla la existencia del password o contraseña
     */
    public Doctor validarUsuario(String nombreUsuario, String password) {
        Doctor u = null;
        boolean existe = false;
        for (int i = 0; i < ListadoUsuario.listadoUsuarios.length && existe == false; i++) {
            Doctor usuarioDeListado = ListadoUsuario.listadoUsuarios[i];
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
    public void modificar(Doctor unUsuario) {
        boolean existe = false;
        for (int i = 0; i < ListadoUsuario.listadoUsuarios.length && existe != true; i++) {
            Doctor usuarioDelListado = ListadoUsuario.listadoUsuarios[i];
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
    public Doctor obtenerUsuario(String nombreUsuario) {
        Doctor u = null;
        boolean existe = false;
        for (int i = 0; i < ListadoUsuario.listadoUsuarios.length && existe == false; i++) {
            Doctor usuarioDeListado = ListadoUsuario.listadoUsuarios[i];
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
    public void crear(Doctor unUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
