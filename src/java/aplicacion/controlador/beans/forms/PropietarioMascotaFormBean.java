package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.PropietarioMascotaBean;
import aplicacion.dao.imp.PropietarioMascotaDAOImp;
import aplicacion.hibernate.dao.IPropietarioDAO;
import aplicacion.modelo.dominio.PropietarioMascota;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
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

    public void visualizarVentanaConfirmarBaja() {
        RequestContext context = RequestContext.getCurrentInstance();
        context.execute("PF('confirmaBajaPropietario').show();");
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

    public void listarArrayUsuarioPdf()
throws JRException, IOException{
Map<String, Object> parametros = new HashMap<String, Object>();
//puedo pasar parametros al report, siempre que el diseño lo soporte
//parametros.put("usuario", "pepito");
List<PropietarioMascota> usuarios = new ArrayList();
usuarios = this.obtenerPropietarios();
File jasper = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/propietario3Report.jasper"));
JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(), parametros, new JRBeanCollectionDataSource(usuarios));
HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
response.setContentType("application/pdf");
response.addHeader("Content-disposition", "attachment; filename=usuario1-report.pdf");
ServletOutputStream stream = response.getOutputStream();
JasperExportManager.exportReportToPdfStream(jasperPrint, stream);
//exportamos a un archivo en disco
//JasperExportManager.exportReportToPdfFile(jasperPrint, "e:/reporte.pdf");
//mostrar en visor jasper
//JasperViewer.viewReport(jasperPrint,false);
stream.flush();
stream.close();
FacesContext.getCurrentInstance().responseComplete();
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
