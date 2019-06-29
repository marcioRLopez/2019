package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.PropietarioMascotaBean;
import aplicacion.dao.imp.PropietarioMascotaDAOImp;
import aplicacion.hibernate.dao.IPropietarioDAO;
import aplicacion.modelo.dominio.PropietarioMascota;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
 *
 * @author EZEQUIEL
 */
@ManagedBean
@ViewScoped
public class PropietarioMascotaFormBean {

    @ManagedProperty(value = "#{propietarioMascotaBean}")
    private PropietarioMascotaBean propietarioMascotaBean;

    public PropietarioMascotaFormBean() {
    }

    public Date getFechaActual() {
        return new Date(System.currentTimeMillis());
    }

    public void establecerPropietario(PropietarioMascota propietario) {
        propietarioMascotaBean.setPropietarioMascota(propietario);
    }

    public List<PropietarioMascota> obtenerPropietarios() {
        IPropietarioDAO propietarioDAO = new PropietarioMascotaDAOImp();
        /*if(TablaPropietarios.tablaPropietarios == null){
            TablaPropietarios.llenarTabla();
        }*/
        return propietarioDAO.obtenerTodos();
    }

    public void visualizarVentanaConfirmarAlta() {
        RequestContext context = RequestContext.getCurrentInstance();
        context.execute("PF('confirmaAltaPropietario').show();");
    }

    public void visualizarVentanaConfirmaModificacion() {
        RequestContext context = RequestContext.getCurrentInstance();
        context.execute("PF('confirmaModificacionPropietario').show();");
    }

    public void modificarPropietario() {
        IPropietarioDAO propietarioDAO = new PropietarioMascotaDAOImp();
        propietarioDAO.modificarPropietario(propietarioMascotaBean.getPropietarioMascota());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operación concretada", "Operación exitosa"));
        RequestContext.getCurrentInstance().execute("PF('confirmaModificacionPropietario').hide();PF('modificacionPropietario').hide()");

    }

    public void grabarNuevoPropietario() {
        IPropietarioDAO propietarioDAO = new PropietarioMascotaDAOImp();
        propietarioDAO.create(propietarioMascotaBean.getPropietarioMascota());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operación concretada", "Operación exitosa"));
        RequestContext.getCurrentInstance().execute("PF('confirmaAltaPropietario').hide();PF('altaPropietario').hide()");

    }

    public void eliminarPropietario() {
        IPropietarioDAO propietarioDAO = new PropietarioMascotaDAOImp();
        propietarioDAO.eliminarPropietario(propietarioMascotaBean.getPropietarioMascota());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operación Concretada :)", "Operación Concretada :)"));
        RequestContext.getCurrentInstance().execute("PF('modificacionPropietario').hide();");
        RequestContext.getCurrentInstance().execute("PF('confirmaBajaPropietario').hide();");
    }

    /**
     * @return the propietarioMascotaBean
     */
    public PropietarioMascotaBean getPropietarioMascotaBean() {
        return propietarioMascotaBean;
    }

    /**
     * @param propietarioMascotaBean the propietarioMascotaBean to set
     */
    public void setPropietarioMascotaBean(PropietarioMascotaBean propietarioMascotaBean) {
        this.propietarioMascotaBean = propietarioMascotaBean;
    }

}
