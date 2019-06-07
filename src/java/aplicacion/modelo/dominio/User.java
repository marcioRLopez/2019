package aplicacion.modelo.dominio;

import java.util.Date;

/**
 * clase generica para definir un CLIENTE que en este caso sera el dueño de la mascota
 *
 * @author GRUPO10
 */
public class User {

    /**
     * atributo de tipo String identificando el documento nacional de identidad
     */
    public String dni;
    /**
     * atributo de tipo String que identifica el apellido del User
     */
    public String apellido;
    /**
     * atributo de tipo String que identifica el nombre del User
     */
    public String nombre;
    /**
     * atributo de tipo Date con la fecha de nacimiento del User
     */
    public Date fechaNac;
    /**
     * atributo de tipo estado que indica si un User esta activo, incluido en el
     * sistema etc
     */

    public boolean estado;
    /**
     * atributo de tipo objeto Mascota que indica la relacion entre un User y su
     * mascota
     */
    public Mascota mascota;

    /**
     * constructor por defecto de la clase
     */
    public User() {

    }

    /**
     * constructor parametrizado de la clase
     *
     * @param dni el documento nacional de identidad
     * @param apellido el apellido del User
     * @param nombre el nombre del User
     * @param fechaNac la fecha de Nacimiento del User
     * @param estado el estado del User dentro del Sistema
     * @param mascota el objeto Mascota
     */
    public User(String dni, String apellido, String nombre, Date fechaNac, boolean estado, Mascota mascota) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.estado = estado;
        this.mascota = mascota;
    }

    // SECCION DE GETTERS Y SETTERS
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

}
