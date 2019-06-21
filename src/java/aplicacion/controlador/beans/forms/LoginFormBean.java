package aplicacion.controlador.beans.forms;

import aplicacion.hibernate.dao.IDoctorDAO;
import aplicacion.hibernate.dao.imp.DoctorDAOImp;
import aplicacion.modelo.dominio.Doctor;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author EZEQUIEL
 */
@ManagedBean
@RequestScoped
public class LoginFormBean {

    private String nombreUsuario;
    private String password;

    public LoginFormBean() {
    }
//el método validarUsuario2 está trabajando con la clase ListadoUsuario
//para que el método mencionado trabaje con una BD solo cambiar validarUsuario2 
//por validarUsuario, o sea simplemente le borras el 2
    public String validarUsuario() {
        String resultado = null;
        System.out.println("BLaaaa");
        IDoctorDAO usuarioDAO = new DoctorDAOImp();
        Doctor unUsuario = usuarioDAO.validarUsuario(nombreUsuario, password);
        if (unUsuario == null) {
            FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Credenciales inválidas", "Credenciales inválidas");
            FacesContext.getCurrentInstance().addMessage(null, mensaje);
        } else {
            FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario válido", "Usuario Válido");
            FacesContext.getCurrentInstance().addMessage(null, mensaje);
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuarioValidado", unUsuario);
            resultado = "menu?faces-redirect=true";
           
        }
        return resultado;
    }

    public String getNombreUsuarioValidado() {
        Doctor usuario = (Doctor) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValidado");
        return usuario.getNombreUsuario();
    }

    public String cerrarSesion() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sesión cerrada", "Sesion cerrada");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        String resultado = "/index?faces-redirect=true";
        return resultado;
    }

    public boolean verificarSesion() {
        boolean sesionValida = false;
        if (FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValidado") != null) {
            sesionValida = true;
        }
        return sesionValida;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
