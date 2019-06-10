package aplicacion.controlador.beans.forms;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author EZEQUIEL
 */
@ManagedBean
@RequestScoped
public class LoginFormBean {

    private String nombreDeUsuario;
    private String passwordUsuario;

    /**
     * @return the nombreDeUsuario
     */
    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    /**
     * @param nombreDeUsuario the nombreDeUsuario to set
     */
    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    /**
     * @return the passwordUsuario
     */
    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    /**
     * @param passwordUsuario the passwordUsuario to set
     */
    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

}
