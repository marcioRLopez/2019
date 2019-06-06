package aplicacion.modelo.dominio;

import java.util.Date;

/**
 *
 * @author clavedesol
 */
/**
 * clase generica para definir un Usuario ya sea administrador, administrativo o
 * cliente
 */
public class User {

    /**
     * atributo de tipo String identificando el documento nacional de identidad
     */
    private String dni;
    /**
     * atributo de tipo String que identifica el apellido del User
     */
    private String apellido;
    /**
     * atributo de tipo String que identifica el nombre del User
     */
    private String nombre;
    /**
     * atributo de tipo Date con la fecha de nacimiento del User
     */
    private Date fechaNac;
    /**
     * atributo de tipo estado que indica si un User esta activo, incluido en el
     * sistema etc
     */
    private boolean estado;

    public User() {
    }

    /**
     * constructor parametrizado de la clase User
     *
     * @param dni documento nacional de identidad
     * @param apellido apellido del User
     * @param nombre nombre del User
     * @param fechaNac fecha de nacimiento del User
     * @param estado estado true or false del User
     */
    public User(String dni, String apellido, String nombre, Date fechaNac, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.estado = estado;
    }
//SECCION DE GETTERS Y SETTERS

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
     * @return the fechaNac
     */
    public Date getFechaNac() {
        return fechaNac;
    }

    /**
     * @param fechaNac the fechaNac to set
     */
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

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

}
