package aplicacion.dao;

import aplicacion.modelo.dominio.Usuario;

/**
 *
 * @author GRUPO10
 *
 * interface de la clase Usuario
 */
public interface IUsuarioDao {

    /**
     * creacion del Usuario y metodo para Validar este mediante su atributo de
     * nombre y password
     *
     * @param nombreUsuario
     * @param password
     * @return Usuario Validado o mensaje de Usuario mal ingresado o inexistente
     */
    Usuario validarUsuario(String nombreUsuario, String password);

    /**
     * metodo para modificar un usuario
     *
     * @param unUsuario
     */
    void modificar(Usuario unUsuario);

    /**
     * creacion del Usuario y metodo de obtencion de Usuario
     *
     * @param nombreUsuario
     * @return Usuario modificado
     */
    Usuario obtenerUsuario(String nombreUsuario);

    /**
     * metodo para crear usuario
     *
     * @param unUsuario
     */
    void crear(Usuario unUsuario);

}
