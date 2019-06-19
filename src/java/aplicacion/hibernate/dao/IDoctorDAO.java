package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Doctor;

/**
 *
 * @author Grupo10
 */
public interface IDoctorDAO {

    Doctor validarUsuario(String nombreUsuario, String password);

    void modificarUsuario(Doctor unUsuario);

    void create(Doctor doctor);

    Doctor obtenerUsuario(String nombreUsuario);
}
