package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.MascotaBean;
import aplicacion.dao.imp.MascotaDAOImp;
import aplicacion.hibernate.dao.IMascotaDAO;
import aplicacion.modelo.dominio.Mascota;
import aplicacion.modelo.dominio.PropietarioMascota;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;
import org.primefaces.context.RequestContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author EZEQUIEL
 */
@ManagedBean
@SessionScoped
public class MascotaFormBean{

    @ManagedProperty(value = "#{pacienteBean}")
    private MascotaBean pacienteBean;
    private UploadedFile file = null;
    private List<PropietarioMascota> propietarios;
    private StreamedContent fotoPaciente;

    @PostConstruct
    public void init() {
        PropietarioMascotaFormBean propietario = new PropietarioMascotaFormBean();
        propietario.obtenerPropietarios();

    }

    public MascotaFormBean() {
    }

    public List<Mascota> obtenerMascotas() {
        IMascotaDAO mascotaDAO = new MascotaDAOImp();

        return mascotaDAO.obtenerListaMascota();
    }

    public Date getFechaActual() {
        return new Date(System.currentTimeMillis());
    }

    public void nuevoPacienteMascota() {
        IMascotaDAO mascotaDAO = new MascotaDAOImp();
        mascotaDAO.crear(pacienteBean.getPaciente());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operación concretada", "Operación exitosa"));
        RequestContext.getCurrentInstance().execute("PF('confirmaAltaMascota').hide();PF('altaMascota').hide()");

    }

    public void eliminarMascota() {
        IMascotaDAO mascotaDAO = new MascotaDAOImp();
        mascotaDAO.borrarPaciente(pacienteBean.getPaciente());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operación Concretada :)", "Operación Concretada :)"));
        RequestContext.getCurrentInstance().execute("PF('modificacionMascota').hide();");
        RequestContext.getCurrentInstance().execute("PF('confirmaBajaMascota').hide();");
    }

    public void cambiarMascota() {
        IMascotaDAO mascotaDAO = new MascotaDAOImp();
        mascotaDAO.modificarMascota(pacienteBean.getPaciente());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operación concretada", "Operación exitosa"));
        RequestContext.getCurrentInstance().execute("PF('confirmaModificacionMascota').hide();PF('modificacionMascota').hide()");

    }
//    public StreamedContent getArchivoFoto() throws IOException {
//        IMascotaDAO pacienteDAO = new MascotaDAOImp();
//        FacesContext context = FacesContext.getCurrentInstance();
//        if (context.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE) {
//            return new DefaultStreamedContent();
//        } else {
//            String nombreMascota = context.getExternalContext().getRequestParameterMap().get("fhc");
//            Mascota paciente = pacienteDAO.obtenerPaciente(nombreMascota);
//            if (paciente.getFoto() == null) {
//                return null;
//            } else {
//                return new DefaultStreamedContent(new ByteArrayInputStream(paciente.getFoto()));
//            }
//        }
//    }

    /**
     * @return the pacienteBean
     */
    public MascotaBean getPacienteBean() {
        return pacienteBean;
    }

    /**
     * @param pacienteBean the pacienteBean to set
     */
    public void setPacienteBean(MascotaBean pacienteBean) {
        this.pacienteBean = pacienteBean;
    }

    /**
     * @return the file
     */
    public UploadedFile getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(UploadedFile file) {
        this.file = file;
    }

    /**
     * @return the propietarios
     */
    public List<PropietarioMascota> getPropietarios() {
        return propietarios;
    }

    /**
     * @param propietarios the propietarios to set
     */
    public void setPropietarios(List<PropietarioMascota> propietarios) {
        this.propietarios = propietarios;
    }

    /**
     * @return the fotoPaciente
     */
    public StreamedContent getFotoPaciente() {
        return fotoPaciente;
    }

    /**
     * @param fotoPaciente the fotoPaciente to set
     */
    public void setFotoPaciente(StreamedContent fotoPaciente) {
        this.fotoPaciente = fotoPaciente;
    }

}
