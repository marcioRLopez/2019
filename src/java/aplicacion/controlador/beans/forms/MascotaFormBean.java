package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.MascotaBean;
import aplicacion.modelo.dominio.PropietarioMascota;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author EZEQUIEL
 */
@ManagedBean
@SessionScoped
public class MascotaFormBean {

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
