package aplicacion.controlador.beans;

import aplicacion.modelo.dominio.Atencion;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author GRUPO10 Clase bean de la clase Atencion servira para su conexion con
 * la pagina web
 */
@ManagedBean
@ViewScoped
public class AtencionBean implements Serializable {

    /**
     * atributo de tipo objeto Atencion
     */
    private Atencion atencion;

    /**
     * constructor por defecto de la clase utilizacion un metodo if si la
     * atencion no existe, se crea una nueva instancia de esa
     */
    public AtencionBean() {
        if (atencion == null) {
            atencion = new Atencion();
        }
    }
// SECCION DE GETTERS Y SETTERS

    /**
     * en este getter indicamos si la atencion no existe se crea una nueva
     *
     * @return regresa esta nueva atencion
     */
    public Atencion getAtencion() {
        if (atencion == null) {
            atencion = new Atencion();
        }
        return atencion;
    }

    /**
     * ese metodo no nos devuelve nada unicamente indica la atencion
     *
     * @param atencion
     */
    public void setAtencion(Atencion atencion) {
        this.atencion = atencion;
    }

}