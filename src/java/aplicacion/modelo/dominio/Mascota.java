
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
    public String nombre;
    /**
     * atributo de tipo String que indica la especie de la mascota ej. felino, canino,etc
     */
    public String especie;
    /**
     * atributo de tipo String que indica el sexo de la mascota ej. macho, hembra
     */
    public String sexo;
    /**
     * atributo de tipo Date que indica la fecha de nacimiento de la mascota
     */
    public Date fechaNacimiento;
    /**
     * atributo de tipo int que indica el numero de historia clinica del paciente
     */
    public int historiaclinica;
    /**
     * atributo de tipo objeto Usuario que indica el Dueño de la mascota
     */
    public Usuario usuario;

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
 * @param fechaNacimiento fecha de nacimiento de la mascota
 * @param historiclinica numero de historia clinica de la mascota
 * @param usuario atributo de tipo objeto Usuario
 */
    public Mascota(String nombre, String especie, String sexo, Date fechaNacimiento, int historiclinica, Usuario usuario) {
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.historiaclinica = historiclinica;
        this.usuario = usuario;
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

    public int getHistoriclinica() {
        return historiaclinica;
    }

    public void setHistoriclinica(int historiclinica) {
        this.historiaclinica = historiclinica;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
    
}
