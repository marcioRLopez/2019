/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.dao.IDoctorDAO;
import aplicacion.dao.imp.DoctorDAOImp;
import aplicacion.modelo.dominio.Propietariomascota;
import aplicacion.modelo.dominio.Doctor;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Dios salva
 */
@ManagedBean
@RequestScoped
public class DoctorBean implements Serializable{
    private Doctor usuario;

    /**
     * Creates a new instance of UsuarioBean
     */
    public DoctorBean() {
        Doctor usuarioSesion = (Doctor) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValidado");
        if (usuarioSesion != null) {
            String nombreUsuario = usuarioSesion.getNombreUsuario();
            IDoctorDAO usuarioDAO = new DoctorDAOImp();
            usuario = usuarioDAO.obtenerUsuario(nombreUsuario);
        }
    }

    /**
     * @return the usuario
     */
    public Doctor getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Doctor usuario) {
        this.usuario = usuario;
    }
    
}
