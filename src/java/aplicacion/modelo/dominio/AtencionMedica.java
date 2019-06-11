package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Grupo10
 */
public class AtencionMedica implements Serializable {
//Atributos de la clase

    private int atencionMedica;
    private Mascota mascota;
    private Doctor usuarioCargo;
    private String diagnostico;
    private String observaciones;
    private Date fechaAtencionMedica;

//Constructor por defecto
    public AtencionMedica() {
    }

//Contructor parametrizado
    public AtencionMedica(int atencionMedica, Mascota mascota, Doctor usuarioCargo, String diagnostico, String observaciones, Date fechaAtencionMedica) {
        this.atencionMedica = atencionMedica;
        this.mascota = mascota;
        this.usuarioCargo = usuarioCargo;
        this.diagnostico = diagnostico;
        this.observaciones = observaciones;
        this.fechaAtencionMedica = fechaAtencionMedica;
    }
    
//MÉTODOS ACCESORES

    /**
     * @return the atencionMedica
     */
    public int getAtencionMedica() {
        return atencionMedica;
    }

    /**
     * @param atencionMedica the atencionMedica to set
     */
    public void setAtencionMedica(int atencionMedica) {
        this.atencionMedica = atencionMedica;
    }

    /**
     * @return the mascota
     */
    public Mascota getMascota() {
        return mascota;
    }

    /**
     * @param mascota the mascota to set
     */
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    /**
     * @return the usuarioCargo
     */
    public Doctor getUsuarioCargo() {
        return usuarioCargo;
    }

    /**
     * @param usuarioCargo the usuarioCargo to set
     */
    public void setUsuarioCargo(Doctor usuarioCargo) {
        this.usuarioCargo = usuarioCargo;
    }

    /**
     * @return the diagnostico
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * @param diagnostico the diagnostico to set
     */
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    /**
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the observaciones to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * @return the fechaAtencionMedica
     */
    public Date getFechaAtencionMedica() {
        return fechaAtencionMedica;
    }

    /**
     * @param fechaAtencionMedica the fechaAtencionMedica to set
     */
    public void setFechaAtencionMedica(Date fechaAtencionMedica) {
        this.fechaAtencionMedica = fechaAtencionMedica;
    }
    
}
