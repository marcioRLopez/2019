package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 * AUTOR GRUPO10 clase que nos indica el Doctor y todos sus atributos
 */
public class Doctor implements Serializable {

     /**
     * atributo que indica el nombre de Doctor utilizado en el sistema
     */
    public String nombreUsuario;
    /**
     * atributo que indica el password de ingreso al sistema del Doctor
     */
    public String password;
    /**
     * atributo que nos da la direccion del e-mail del Doctor
     */
    public String correoElectronico;
    /**
     * atributo de tipo objeto de nombre PropietarioDeMascota propietarioDeMascota
     */

    

    /**
     * cosntructor por defecto de la clase
     */
    public Doctor() {

    }

    /**
     * constructor parametrizado de la clase PropietarioDeMascota
     *
     * @param nombreUsuario nombre identificatorio del Usuario
     * @param password password o contraseña del Usuario dentro del Sistema
     * @param correoElectronico direccion del E-mail del Usuario
     */
    public Doctor(String nombreUsuario, String password, String correoElectronico) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.correoElectronico = correoElectronico;
        
    }

    //SECCION DE GETTERS Y SETTERS
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
