/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controladorFormsBeans;

import aplicacion.dao.IDoctorDAO;
import aplicacion.dao.imp.DoctorDAOImp;
import aplicacion.modelo.dominio.Doctor;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Dios salva
 */
@ManagedBean
@RequestScoped
public class LoginFormBean implements Serializable{
    private String nombreUsuario;
    private String password;
    
    public String validarUsuario(){
        String resultado = null;
        IDoctorDAO usuarioDAO = new DoctorDAOImp();
        Doctor usuario = usuarioDAO.validarUsuario(nombreUsuario, password);
        if(usuario!=null){
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario válido", "Usuario válido");
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
            
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuarioValidado", usuario);
            resultado = "menu?faces-redirect=true";
        }else{
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Credenciales Inválidas", "Credenciales Inválidas");
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        }
        return resultado;
    }
    
    public String getNombreUsuarioValidado(){
        Doctor usuario = (Doctor)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValidado");
        return usuario.getNombreUsuario();
    }
    
    public String cerrarSesion(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sesión Cerrada", "Sesión Cerrada");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        
        String resultado = "/index?faces-redirect=true";
        return resultado;
    }
    
    public boolean verificarSesion(){
        boolean sesionValida = false;
        if(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValidado")!=null){
            sesionValida=true;
        }
        return sesionValida;
    }
    
    /**
     * Creates a new instance of LoginBean
     */
    public LoginFormBean() {
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
