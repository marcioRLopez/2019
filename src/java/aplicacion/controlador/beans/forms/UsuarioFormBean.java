package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.UsuarioBean;
import aplicacion.dao.IUsuarioDao;
import aplicacion.dao.imp.IUsuarioDaoImp;
import aplicacion.modelo.util.ListadoUsuario;
import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author clavedesol
 *
 * Bean Administrativo de la clase
 */
@ManagedBean
@RequestScoped
public class UsuarioFormBean {

    /**
     * inyecta la clase bean
     */
    @ManagedProperty(value = "#{usuarioBean}")
    /**
     * atributo de tipo objeto bean
     */
    private UsuarioBean usuarioBean;

    public UsuarioFormBean() {
    }

    /**
     * metodo para actualizar los datos del UsuarioBean a su vez actualiza los
 datos de la clase Usuario y Clase PropietarioDeMascota
     */
    public void actualizarDatos() {
        IUsuarioDao usuarioDao = new IUsuarioDaoImp();
        usuarioBean.getUsuario().getPropietarioDeMascota().setEstado(true);
        usuarioDao.modificar(usuarioBean.getUsuario());
        FacesMessage facesmessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Datos actualizados", "Datos Actualizados");
        FacesContext.getCurrentInstance().addMessage(null, facesmessage);

    }

    /**
     * lista de usuarios y get de listado de usuarios
     *
     * @return regresa el usuario en la lista
     */
    public ListadoUsuario getListadoUsuarios() {
        ListadoUsuario usuario = new ListadoUsuario();
        return usuario;
    }

    /**
     * @return the usuarioBean
     */
    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    /**
     * @param usuarioBean the usuarioBean to set
     */
    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

}
