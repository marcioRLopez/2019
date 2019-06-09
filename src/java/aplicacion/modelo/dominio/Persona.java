package aplicacion.modelo.dominio;

import java.util.Date;

/**
 *
 * @author EZEQUIEL
 */
public class Persona {

    /**
     * Atributos que serán usados por otras clase , DueñoMascota
     */
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    private String dni;

//Constructor por defecto
    public Persona() {
    }

//Constructor parametrizado
    public Persona(String nombre, String apellido, Date fechaDeNacimiento, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.dni = dni;
    }

//Métodos accesores get y set
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the fechaDeNacimiento
     */
    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    /**
     * @param fechaDeNacimiento the fechaDeNacimiento to set
     */
    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

}
