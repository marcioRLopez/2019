package aplicacion.controlador.beans;


import aplicacion.modelo.dominio.Mascota;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author GRUPO10
 * Clase bean de la clase Mascota 
 * necesaria para la conexion con la pagina web
 */
@ManagedBean
@SessionScoped
public class MascotaBean implements Serializable {
/**
 * atributo de tipo objeto
 */
    private Mascota mascota;

   /**
    * constuctor por defecto de la clase
    * utilizamos un metodo if,si la mascota no existe
    * se la crea
    */
    public MascotaBean() {
        if (mascota == null) {
            mascota = new Mascota();
           
            //paciente.setPropietarioMascota(new PropietarioMascota());
        }
    }
// SECCION DE GETTERS Y SETTERS
    public Mascota getMascota() {
        if (mascota == null) {
            mascota = new Mascota();
        }
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

}