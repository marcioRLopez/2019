
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Grupo10
 * Clase que indica el tipo de medicamento aplicado a la mascota 
 * durante su atencion
 */
public class Medicamento implements Serializable {
    /**
     * atributo que indica el codigo identificatorio del medicamento aplicado
     */
    
    private Integer idMedicamento;
    /**
     * atributo que indica el nombre generico o especifico del medicamento aplicado
     */
    private String nombre;
    /**
     * atributo que indica la fecha de vencimiento del medicamento aplicado para su posterior deshecho
     */
    private byte fechaVencimiento; // Definir este atributo de tipo fecha;
    /**
     * atributo que nos da una explicacion y posologia del medicamento aplicado
     */
    private String descripcion;
    /**
     * atributo que indica el estado del medicamento aplicado
     * puede tomar varios estados ej disponible, no disponible, etc
     */
    private Boolean estado;
    
    /**
     * Constructor por defecto de la clase
     */
    public Medicamento() {
    }
    
    /**
     * Constructor parametrizado de la clase
     * @param codigo el identificador del medicamento aplicado
     * @param nombre el nombre identificatorio del medicamento aplicado
     * @param fechaVencimiento la fecha de vencimiento o validez del medicamento aplicado
     * @param descripcion  la explicacion y posologia del medicamento
     */
    public Medicamento(Integer idMedicamento, String nombre, byte fechaVencimiento, String descripcion, Boolean estado) {
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    
    // Seccion de Getter y Setter

    public Integer getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(Integer idMedicamento) {
        this.idMedicamento = idMedicamento;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(byte fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
    
}
