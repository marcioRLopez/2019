package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 * clase CLIENTE que en este caso sera el dueño de la
 * mascota
 *
 * @author GRUPO10
 */
public class PropietarioMascota implements Serializable {

    /**
     * atributo de tipo estado que indica si un PropietarioMascota esta
 activo, incluido en el sistema etc
     */
    private boolean estado;
    /**
     * Domicilio del propietario
     */
    private String direccion;
    /**
     * Número telefonico del propietario
     */
    private String telefono;

    /**
     * constructor por defecto de la clase
     */
    public PropietarioMascota() {

    }

    /**
     * constructor parametrizado
     *
     * @param estado el estado del propietario dentro del Sistema
     * @param direccion el objeto Mascota
     * @param telefono el objeto Mascota
     */
    public PropietarioMascota(boolean estado, String direccion, String telefono) {
        this.estado = estado;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * Constructor con atributos heredados de la clase persona
     *
     * @param estado
     * @param direccion el estado del User dentro del Sistema
     * @param telefono el objeto Mascota
     * @param nombre el nombre del dueño dentro del Sistema
     * @param apellido del propietario
     * @param fechaDeNacimiento la fecha de nacimiento del dueño dentro del
     * Sistema
     * @param dni el Documento Nacionel de Identidad del dueño de Mascota
     */
    public PropietarioMascota(boolean estado, String direccion, String telefono, String nombre, String apellido, Date fechaDeNacimiento, String dni) {
        
        this.estado = estado;
        this.direccion = direccion;
        this.telefono = telefono;
    }

// SECCION DE GETTERS Y SETTERS 
    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
