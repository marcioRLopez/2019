package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Grupo10
 * clase que nos indica todo lo relacionado a la atencion medica realizada 
 * por el doctor sobre la mascota
 */
public class AtencionMedica implements Serializable {
    /**
     * atributo que indica el codigo identificatorio de la atencion medica realizada
     */
    private Integer idAtencion;
    /**
     * atributo que indica la fecha de la atencion medica realizada
     */
    private Date fechaAtencion;
    /**
     * atributo que indica el diagnostica resultante de la atencion medica realizada
     */
    private String diagnostico;
    /**
     * atributo que indica las anotaciones o agregados a la atencion medica realizada
     */
    private String observacion;
    /**
     * atributo de tipo objeto la mascota
     */
    private Mascota mascota;
    /**
     * atributo de tipo objeto el propietario de la mascota
     */
    private PropietarioMascota propietarioMascota;
    /**
     * atributo de tipo objeto el medicamento aplicado a la mascota luego de su atencion medica realizada
     */
    private Medicamento medicamento;
    /**
     * atributo que indica el valor del estado de la clase ej. disponible, no disponible, etc
     */
    private Boolean estado;
    
/**
 * constructor por defecto de la clase
 */
    
    public AtencionMedica() {
    }
/**
 * constructor parametrizado de la clase
 * @param idAtencion el codigo o identificador de la clase
 * @param fechaAtencion la fecha de la atencion realizada
 * @param diagnostico el diagnostico o estudio realizado luego de la atencion medica
 * @param observacion las anotaciones o agregados de la atencion medica
 * @param mascota el objeto mascota
 * @param propietarioMascota el objeto propietario de la mascota
 * @param medicamento el medicamento aplicado a la mascota luego de la atencion medica
 * @param estado el valor que toma la atencion medica
 */
    
    public AtencionMedica(Integer idAtencion, Date fechaAtencion, String diagnostico, String observacion, Mascota mascota, PropietarioMascota propietarioMascota, Medicamento medicamento, Boolean estado) {
        this.idAtencion = idAtencion;
        this.fechaAtencion = fechaAtencion;
        this.diagnostico = diagnostico;
        this.observacion = observacion;
        this.mascota = mascota;
        this.propietarioMascota = propietarioMascota;
        this.medicamento = medicamento;
        this.estado = estado;
    }
//SECCION DE GETTERS Y SETTERS
    
    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public int getIdAtencion() {
        return idAtencion;
    }

    public void setIdAtencion(int idAtencion) {
        this.setIdAtencion((Integer) idAtencion);
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public PropietarioMascota getPropietarioMascota() {
        return propietarioMascota;
    }

    public void setPropietarioMascota(PropietarioMascota propietarioMascota) {
        this.propietarioMascota = propietarioMascota;
    }

    /**
     * @param idAtencion the idAtencion to set
     */
    public void setIdAtencion(Integer idAtencion) {
        this.idAtencion = idAtencion;
    }

    /**
     * @return the estado
     */
    public Boolean getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
    
}
