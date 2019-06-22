package aplicacion.controlador.beans;


import aplicacion.modelo.dominio.PropietarioMascota;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author GRUPO10
 * Clase bean de la clase PropietarioMascota
 * necesaria para hacer la conexion con la paginaweb
 */
@ManagedBean
@ViewScoped
public class PropietarioMascotaBean implements Serializable{
    /**
     * atributo de tipo objeto
     */
    public PropietarioMascota propietarioMascota;

    /**
     * constructor por defecto de la clase
     * utiliza un metodo if que si el propietarioMascota 
     * no existe se crea un nuevo
     */
    public PropietarioMascotaBean() {
        if (propietarioMascota == null){
            propietarioMascota = new PropietarioMascota();
        }
    }

    //SECCION DE GETTERS Y SETTERS
    public PropietarioMascota getPropietarioMascota() {
        if(propietarioMascota == null){
            propietarioMascota = new PropietarioMascota();
        }
            return propietarioMascota;
    }

    public void setPropietarioMascota(PropietarioMascota propietarioMascota) {
        this.propietarioMascota = propietarioMascota;
    }
    
}
