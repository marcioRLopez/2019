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
    
    private int codigo;
    private String nombre;
    private byte fechaVencimiento; // Definir este atributo de tipo fecha;
    private String descripcion;
    
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
    public Medicamento(int codigo, String nombre, byte fechaVencimiento, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.descripcion = descripcion;
    }
    
    // Seccion de Getter y Setter

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    
    
    
    
    
    
    
}
