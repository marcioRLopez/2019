/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Grupo10
 */
public class Vacuna implements Serializable {
    private Integer codigo;
    private String nombre;
    private String tipoVacuna;
    private Boolean estado;

    public Vacuna() {
    }

    public Vacuna(Integer codigo, String nombre, String tipoVacuna, Boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoVacuna = tipoVacuna;
        this.estado = estado;
    }

    
    
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
    
}
