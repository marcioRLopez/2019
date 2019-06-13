package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Grupo10
 */
public class AtencionMedica implements Serializable {
    
    private Integer idAtencion;
    private Date fechaAtencion;
    private String diagnostico;
    private String observacion;
    private Mascota mascota;
    private PropietarioMascota propietarioMascota;
    private Medicamento medicamento;
    private Boolean estado;

    
    public AtencionMedica() {
    }

    
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
