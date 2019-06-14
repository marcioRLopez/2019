
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Grupo10
 * Clase que nos indica la vacuna aplicada a la mascota
 */
public class Vacuna implements Serializable {
    /**
     * atributo que identifica el codigo de la vacuna, y facilita su identificacion
     */
    private Integer idVacuna;
    /**
     * atributo que identifica la vacuna por su nombre
     */
    private String nombre;
    /**
     * atributo que identifica el nombre de la vacuna
     */
    private String tipoVacuna;
    /**
     * atributo que identificara el estado de la vacuna que en este caso puecde ser
     * aplicada, no aplicada, disponible no disponible, 
     * 
     */
    private Boolean estado;
    
    /**
     * constructor por defecto de la classe
     */

    public Vacuna() {
    }
/**
 * constructor parametrizado de la clase
 * @param idVacuna el codigo de la vacuna numero de lote
 * @param nombre nombre identificatorio de la vacuna
 * @param tipoVacuna tipo o clase de vacuna 
 * @param estado  estado aplicada no aplicada, disponible, no disponible
 */
    public Vacuna(Integer idVacuna, String nombre, String tipoVacuna, Boolean estado) {
        this.idVacuna = idVacuna;
        this.nombre = nombre;
        this.tipoVacuna = tipoVacuna;
        this.estado = estado;
    }

    // SECCION DE GETTERS Y SETTERS
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipoVacuna
     */
    public String getTipoVacuna() {
        return tipoVacuna;
    }

    /**
     * @param tipoVacuna the tipoVacuna to set
     */
    public void setTipoVacuna(String tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    public Integer getidVacuna() {
        return idVacuna;
    }

    public void setidVacuna(Integer idVacuna) {
        this.idVacuna = idVacuna;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
    
}
