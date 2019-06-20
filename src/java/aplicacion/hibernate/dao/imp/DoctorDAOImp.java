package aplicacion.hibernate.dao.imp;


import aplicacion.hibernate.dao.IDoctorDAO;
import aplicacion.modelo.dominio.Doctor;
import java.io.Serializable;
//import aplicacion.modelo.util.ListadoUsuarios; // importante!!! hay que eliminar esta linea de codigo ya que no vamos a trabajar con una lista de usuarios
/**
 *
 * @author Grupo10
 */
public class DoctorDAOImp extends GenericDAOimp<Doctor, String> implements Serializable, IDoctorDAO {

    // CODIGO PARA ELIMINAR(no se utilizan lista)
    /**@Override
    public Doctor validarUsuario(String nombreUsuario, String password) {
        Doctor usuario = null;
        for (int i = 0; i < ListadoUsuarios.tablaUsuarios.length; i++) {
            if (ListadoUsuarios.tablaUsuarios[i] != null) {
                if (ListadoUsuarios.tablaUsuarios[i].getNombreUsuario().equals(nombreUsuario) && ListadoUsuarios.tablaUsuarios[i].getPassword().equals(password)) {
                    usuario = ListadoUsuarios.tablaUsuarios[i];
                    break;
                }
            }
        }
        return usuario;
    } **/
    
    
    // CODIGO PARA ELIMINAR(no se utilizan lista)
    /**@Override
    public void modificarUsuario(Doctor unUsuario) {
        boolean encontrado = false;
        for (int i = 0; i < ListadoUsuarios.tablaUsuarios.length && encontrado != true; i++) {
            Doctor usuarioListado = ListadoUsuarios.tablaUsuarios[i];
            if (usuarioListado.getNombreUsuario().equals(unUsuario.getNombreUsuario())) {
                ListadoUsuarios.tablaUsuarios[i] = unUsuario;
                encontrado = true;
            }
        }

    }**/
    
    
    
    // CODIGO PARA ELIMINAR(no se utilizan lista)
    /**@Override
    public Doctor obtenerUsuario(String nombreUsuario) {
        Doctor usuario = null;
        for (int i = 0; i < ListadoUsuarios.tablaUsuarios.length; i++) {
            if (ListadoUsuarios.tablaUsuarios[i] != null) {
                if (ListadoUsuarios.tablaUsuarios[i].getNombreUsuario().equals(nombreUsuario)) {
                    usuario = ListadoUsuarios.tablaUsuarios[i];
                    break;
                }
            }
        }
        return usuario;
    }**/

}
