package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.AtencionBean;
import aplicacion.dao.imp.AtencionDAOImp;
import aplicacion.hibernate.dao.IAtencionDAO;
import aplicacion.modelo.dominio.Atencion;
import aplicacion.modelo.dominio.Mascota;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
 *
 * @author EZEQUIEL
 */
@ManagedBean
@SessionScoped
public class AtencionFormBean {
    
    @ManagedProperty(value = "#{atencionBean}")
    private AtencionBean atencionBean;
    private List<Mascota> pacientes;
    
    private List<Atencion> algunasAtenciones;
    private Date fechaDesde;
    private Date fechaHasta;
    private Date fechaActual;
    private Mascota pacienteFormBusq;
    
    @PostConstruct
    public void init() {
        MascotaFormBean pac = new MascotaFormBean();
        
    }
    
    public AtencionFormBean() {
    }
    
    public void grabarNuevaAtencion() {
        IAtencionDAO atencionDAO = new AtencionDAOImp();
        atencionDAO.create(atencionBean.getAtencion());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operación concretada", "Operación exitosa"));
        RequestContext.getCurrentInstance().execute("PF('confirmaAltaAtencion').hide();PF('altaAtencion').hide()");
        
    }
    
    public void modificarAtencion() {
        IAtencionDAO propietarioDAO = new AtencionDAOImp();
        propietarioDAO.actualizarAtencion(atencionBean.getAtencion());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operación concretada", "Operación exitosa"));
        RequestContext.getCurrentInstance().execute("PF('confirmaModificacionAtencion').hide();PF('modificacionAtencion').hide()");
        
    }
    
    public void visualizarVentanaConfirmarBajaAtencion() {
        RequestContext context = RequestContext.getCurrentInstance();
        context.execute("PF('confirmaBajaAtencion').show();");
    }

    public void eliminarAtencion() {
        IAtencionDAO atencionDAO = new AtencionDAOImp();
        atencionDAO.borrarAtencion(atencionBean.getAtencion());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operación Concretada :)", "Operación Concretada :)"));
        RequestContext.getCurrentInstance().execute("PF('modificacionAtencion').hide();");
        RequestContext.getCurrentInstance().execute("PF('confirmaBajaAtencion').hide();");
    }

    /**
     * @return the atencionBean
     */
    public AtencionBean getAtencionBean() {
        return atencionBean;
    }

    /**
     * @param atencionBean the atencionBean to set
     */
    public void setAtencionBean(AtencionBean atencionBean) {
        this.atencionBean = atencionBean;
    }

    /**
     * @return the pacientes
     */
    public List<Mascota> getPacientes() {
        return pacientes;
    }

    /**
     * @param pacientes the pacientes to set
     */
    public void setPacientes(List<Mascota> pacientes) {
        this.pacientes = pacientes;
    }

    /**
     * @return the algunasAtenciones
     */
    public List<Atencion> getAlgunasAtenciones() {
        return algunasAtenciones;
    }

    /**
     * @param algunasAtenciones the algunasAtenciones to set
     */
    public void setAlgunasAtenciones(List<Atencion> algunasAtenciones) {
        this.algunasAtenciones = algunasAtenciones;
    }

    /**
     * @return the fechaDesde
     */
    public Date getFechaDesde() {
        return fechaDesde;
    }

    /**
     * @param fechaDesde the fechaDesde to set
     */
    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    /**
     * @return the fechaHasta
     */
    public Date getFechaHasta() {
        return fechaHasta;
    }

    /**
     * @param fechaHasta the fechaHasta to set
     */
    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    /**
     * @return the fechaActual
     */
    public Date getFechaActual() {
        return fechaActual;
    }

    /**
     * @param fechaActual the fechaActual to set
     */
    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    /**
     * @return the pacienteFormBusq
     */
    public Mascota getPacienteFormBusq() {
        return pacienteFormBusq;
    }

    /**
     * @param pacienteFormBusq the pacienteFormBusq to set
     */
    public void setPacienteFormBusq(Mascota pacienteFormBusq) {
        this.pacienteFormBusq = pacienteFormBusq;
    }
    
}
