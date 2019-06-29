package aplicacion.controlador.beans;

import aplicacion.modelo.dominio.PropietarioMascota;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author EZEQUIEL
 */
@ManagedBean
@ViewScoped
public class PropietarioMascotaBean {

    private PropietarioMascota propietarioMascota;

    public PropietarioMascotaBean() {
        if (propietarioMascota == null) {
            propietarioMascota = new PropietarioMascota();
        }
    }

    /**
     * @return the propietarioMascota
     */
    public PropietarioMascota getPropietarioMascota() {
        if (propietarioMascota == null) {
            propietarioMascota = new PropietarioMascota();
        }

        return propietarioMascota;
    }

    /**
     * @param propietarioMascota the propietarioMascota to set
     */
    public void setPropietarioMascota(PropietarioMascota propietarioMascota) {
        this.propietarioMascota = propietarioMascota;
    }

}
