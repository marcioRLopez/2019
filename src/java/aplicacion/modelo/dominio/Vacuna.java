package aplicacion.modelo.dominio;
// Generated 15/06/2019 05:37:58 PM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * Vacuna generated by hbm2java
 */
public class Vacuna implements java.io.Serializable {

    private String idVacuna;
    private String nombreVacuna;
    private String lote;
    private Date fecha;
    private Boolean estado;

    public Vacuna() {
    }

    public Vacuna(String idVacuna) {
        this.idVacuna = idVacuna;
    }

    public Vacuna(String idVacuna, String nombreVacuna, String lote, Date fecha, Boolean estado) {
        this.idVacuna = idVacuna;
        this.nombreVacuna = nombreVacuna;
        this.lote = lote;
        this.fecha = fecha;
        this.estado = estado;
    }

    public String getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(String idVacuna) {
        this.idVacuna = idVacuna;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

}
