package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author EZEQUIEL
 */
public class DueñoMascota extends Persona implements Serializable {

//Atributos de esta clase
    private String telefono;
    private String direccion;

    //Constructor por defecto
    public DueñoMascota() {
    }

    public DueñoMascota(String telefono, String direccion) {
        this.telefono = telefono;
        this.direccion = direccion;
    }

//Atributos que hereda de la clase Persona
    public DueñoMascota(String telefono, String direccion, String nombre, String apellido, Date fechaDeNacimiento, String dni) {
        super(nombre, apellido, fechaDeNacimiento, dni);
        this.telefono = telefono;
        this.direccion = direccion;
    }
//Métodos accesores get y set

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

}
