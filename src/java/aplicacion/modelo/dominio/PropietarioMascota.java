package aplicacion.modelo.dominio;
// Generated 15/06/2019 05:37:58 PM by Hibernate Tools 4.3.1



/**
 * PropietarioMascota generated by hbm2java
 */
public class PropietarioMascota  implements java.io.Serializable {


     private String dni;
     private String nombre;
     private String apellido;
     private String direccion;
     private String telefono;
     private String correoElectronico;
     private Boolean estado;

    public PropietarioMascota() {
    }

    public PropietarioMascota(String dni, String nombre, String apellido, String direccion, String telefono, String correoElectronico, Boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.estado = estado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    

}


