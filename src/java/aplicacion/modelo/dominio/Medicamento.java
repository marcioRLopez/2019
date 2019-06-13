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
public class Medicamento implements Serializable {
    
    private Integer idMedicamento;
    private String nombre;
    private byte fechaVencimiento; // Definir este atributo de tipo fecha;
    private String descripcion;
    private Boolean estado;
    
    /**
     * Constructor por defecto
     */
    public Medicamento() {
    }
    
    /**
     * Constructor parametrizado
     * @param codigo
     * @param nombre
     * @param fechaVencimiento
     * @param descripcion 
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
