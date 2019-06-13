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
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correo;
    private Boolean estado;

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
    public PropietarioMascota(String dni, String nombre, String apellido, String direccion, String telefono, String correo) {
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
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }


    /**
     * @return the estado
     */
    public Boolean getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    

}
