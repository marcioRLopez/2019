package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Doctor;

/**
 *
 * @author Grupo10
 */
public interface IDoctorDAO {

    //Doctor validarUsuario(String nombreUsuario, String password);
77
    void modificarUsuario(Doctor unUsuario);

    void create(Doctor doctor);

    Doctor obtenerUsuario(String nombreUsuario);
}
