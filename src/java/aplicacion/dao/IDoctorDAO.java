package aplicacion.dao;

import aplicacion.modelo.dominio.Doctor;

/**
 *
 * @author Grupo10
 */
public interface IDoctorDAO {

    /**
     * Valida la existencia de un usuario
     *
     * @param nombreUsuario
     * @param password
     * @return null si no existe.
     */
    Doctor validarUsuario(String nombreUsuario, String password);

    //Doctor validarUsuario2(String nombreUsuario, String password);

    void modificar(Doctor unUsuario);

    Doctor obtenerUsuario(String nombreUsuario);
}
