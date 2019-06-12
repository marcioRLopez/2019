
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author GRUPO 10
 * clase que indica los atributos de  la mascota
 */

public class Mascota implements Serializable{

   /**
    * atributo de tipo String que indica el nombre de la mascota
    */
    private String nombre;
    /**
     * atributo de tipo String que indica la especie de la mascota ej. felino, canino,etc
     */
    private String especie;
    /**
     * atributo de tipo String que indica el sexo de la mascota ej. macho, hembra
     */
    private String sexo;
    /**
     * 
     */
    private String raza;
    /**
     * atributo de tipo Date que indica la fecha de nacimiento de la mascota
     */
    private Date fechaNacimiento;
    /**
     * 
     */
    private float peso;
    

    /**
     * constructor por defecto de la clase Mscota
     */
    public Mascota() {
    }
/**
 * constructor parametrizado de la clase Mascota
 * @param nombre el nombre de la mascota
 * @param especie canino o felino u otro
 * @param sexo macho o hembra
 * @param raza
 * @param fechaNacimiento fecha de nacimiento de la mascota
 * @param peso
 */
    
    public Mascota(String nombre, String especie, String sexo, String raza, Date fechaNacimiento, float peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
    }
    
    // SECCION DE GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
