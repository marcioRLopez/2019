package aplicacion.controlador.beans;

import aplicacion.modelo.dominio.Atencion;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author EZEQUIEL
 */
@ManagedBean
@SessionScoped
public class AtencionBean {

    private Atencion atencion;

    public AtencionBean() {
        if (atencion == null) {
            atencion = new Atencion();
        }
    }

    /**
     * @return the atencion
     */
    public Atencion getAtencion() {
        if (atencion == null) {
            atencion = new Atencion();
        }
        return atencion;
    }

    /**
     * @param atencion the atencion to set
     */
    public void setAtencion(Atencion atencion) {
        this.atencion = atencion;
    }

}
