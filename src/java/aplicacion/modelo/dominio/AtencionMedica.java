package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Grupo10
 */
public class AtencionMedica implements Serializable {
    
    int idAtencion;
    Date fechaAtencion;
    String diagnostico;
    String observacion;
    Mascota mascota;
    PropietarioMascota propietarioMascota;
    Medicamento medicamento;

}
