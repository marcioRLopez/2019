package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 * clase PropietarioMascota que en este caso sera el dueño de la
 * mascota
 *
 * @author GRUPO10
 */
public class PropietarioMascota implements Serializable {
    
    /**
     * Atributos de la clase de propietario de la mascota
     */
    private long dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private long telefono;
    private String correo;

    /**
     * Constructor por defecto
     */
    public PropietarioMascota() {
    }
    
    /**
     * Constructor Parametrizado
     * @param dni
     * @param nombre
     * @param apellido
     * @param direccion
     * @param telefono
     * @param correo 
     */
    public PropietarioMascota(long dni, String nombre, String apellido, String direccion, long telefono, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    // SECCION DE GETTER Y SETTER

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    

}
