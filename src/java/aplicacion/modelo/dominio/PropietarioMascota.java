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
     * atributo que indica el documento nacional de identidad del propietario de la  mascota
     * necesario para su identificacion
     */
    private Integer dni;
    /**
     * atributo que indica el nombre del propietario de la mascota
     */
    private String nombre;
    /**
     * atributo que indica el apellido del propietario de la mascota
     */
    private String apellido;
    /**
     * attributo que indica la direccion o domicilio del propietario de la mascota
     * necesario para su identificacion
     */
    private String direccion;
    /**
     * atributo que indica el numero telefonico del propietario de la mascota
     * necesario para su identificacion
     */
    private String telefono;
    /**
     * atributo que indica el correo electronico o email del propietario de la mascota 
     * necesario para su identificacion
     */
    private String correo;
    /**
     * atributo que indica el estado del propietario de la mascota
     * puede indicar varios estados tales como atendido, en espera, etc
     */
    private Boolean estado;

    /**
     * Constructor por defecto
     */
    public PropietarioMascota() {
    }
    
    /**
     * Constructor Parametrizado de la clase
     * @param dni el documento nacional de identidad del propietario
     * @param nombre el nombre del propietario
     * @param apellido el apellido del propietario
     * @param direccion la direccion o domicilio del propietario
     * @param telefono el numero telefonico fijo o de celular del propietario
     * @param correo  el correo electronico del propietario
     */
    public PropietarioMascota(Integer dni, String nombre, String apellido, String direccion, String telefono, String correo) {
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

    /**
     * @return the dni
     */
    public Integer getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(Integer dni) {
        this.dni = dni;
    }
    

}
