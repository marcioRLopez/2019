/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.hibernate.dao.IDoctorDAO;
import aplicacion.hibernate.dao.imp.DoctorDAOImp;
import aplicacion.controlador.beans.DoctorBean;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Grupo10
 */
@ManagedBean
@RequestScoped
public class DoctorFormBean implements Serializable{
    @ManagedProperty(value = "#{usuarioBean}")
    private DoctorBean usuarioBean;

    /**
     * Creates a new instance of UsuarioFormBean
     */
    public DoctorFormBean() {
    }

    /**
     * @return the usuarioBean
     */
    public DoctorBean getUsuarioBean() {
        return usuarioBean;
    }
    
    public void actualizarDatos(){
        
        IDoctorDAO usuarioDAO = new DoctorDAOImp();
        usuarioDAO.modificar(usuarioBean.getUsuario());
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Datos actualizados", "Datos actualizados");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        
    }

    /**
     * @param usuarioBean the usuarioBean to set
     */
    public void setUsuarioBean(DoctorBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }
    
}
