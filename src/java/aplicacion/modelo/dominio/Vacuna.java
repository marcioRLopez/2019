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

    public Vacuna(String nombre, String tipo_vacuna) {
        this.nombre = nombre;
        this.tipo_vacuna = tipo_vacuna;
    }
    
    private String nombre;
    private String tipo_vacuna;

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
     * @return the tipo_vacuna
     */
    public String getTipo_vacuna() {
        return tipo_vacuna;
    }

    /**
     * @param tipo_vacuna the tipo_vacuna to set
     */
    public void setTipo_vacuna(String tipo_vacuna) {
        this.tipo_vacuna = tipo_vacuna;
    }
}
