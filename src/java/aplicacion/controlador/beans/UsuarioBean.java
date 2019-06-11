package aplicacion.controlador.beans;

//import aplicacion.dao.IUsuarioDao;
//import aplicacion.dao.imp.UsuarioDaoImp;
//import aplicacion.modelo.dominio.PropietarioDeMascota;

import aplicacion.modelo.dominio.Doctor;
import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 *
 * @author Grupo10
 */
@ManagedBean
@RequestScoped
public class UsuarioBean {

    /**
     * atributo de tipo objeto Doctor
     */
    private Doctor usuario;

    /**
     * crea un nueva instancia de UsuarioBean
     */
    
    
         // error!!! Metodo comentado por atributo(PropietarioDeMascota) extraido de la clase Doctor
         // Se comentaron algunas clases comentadas
    //****************************************************************************
    /**
    public UsuarioBean() {
        if (usuario != null) {
            String nombreUsuario = usuario.getNombreUsuario();
            IUsuarioDao usuarioDao = new UsuarioDaoImp();
            usuario = usuarioDao.obtenerUsuario(nombreUsuario);
            if (usuario.getPropietarioDeMascota() == null) {
                usuario.setPropietarioDeMascota(new PropietarioDeMascota());
            }
        }
    }**/
    //****************************************************************************

    
    
    
    /**
     * @return the usuario
     */
    public Doctor getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Doctor usuario) {
        this.usuario = usuario;
    }

}
