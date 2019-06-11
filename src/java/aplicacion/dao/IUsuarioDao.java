package aplicacion.dao;

import aplicacion.modelo.dominio.Doctor;

/**
 *
 * @author GRUPO10

 interface de la clase Doctor
 */
public interface IUsuarioDao {

    /**
     * creacion del Doctor y metodo para Validar este mediante su atributo de
 nombre y password
     *
     * @param nombreUsuario
     * @param password
     * @return Doctor Validado o mensaje de Doctor mal ingresado o inexistente
     */
    Doctor validarUsuario(String nombreUsuario, String password);

    /**
     * metodo para modificar un usuario
     *
     * @param unUsuario
     */
    void modificar(Doctor unUsuario);

    /**
     * creacion del Doctor y metodo de obtencion de Doctor
     *
     * @param nombreUsuario
     * @return Doctor modificado
     */
    Doctor obtenerUsuario(String nombreUsuario);

    /**
     * metodo para crear usuario
     *
     * @param unUsuario
     */
    void crear(Doctor unUsuario);

}
