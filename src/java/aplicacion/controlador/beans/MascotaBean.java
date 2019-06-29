package aplicacion.controlador.beans;

import aplicacion.modelo.dominio.Mascota;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author EZEQUIEL
 */
@ManagedBean
@SessionScoped
public class MascotaBean implements Serializable {

    private Mascota paciente;

    public MascotaBean() {
        paciente = new Mascota();
    }

    /**
     * @return the paciente
     */
    public Mascota getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Mascota paciente) {
        this.paciente = paciente;
    }

}
