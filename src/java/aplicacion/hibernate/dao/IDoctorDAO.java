package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Doctor;

/**
 *
 * @author EZEQUIEL
 */

// esta interface trabaja sin IGeneriDAO
public interface IDoctorDAO {

    /**
     * Valida la existencia de un usuario
     *
     * @param nombreUsuario
     * @param password
     * @return null si no existe.
     */
    Doctor validarUsuario(String nombreUsuario, String password);

    void create(Doctor doctor);
    //Doctor validarUsuario2(String nombreUsuario, String password);

    void modificar(Doctor unUsuario);

    Doctor obtenerUsuario(String nombreUsuario);
}
