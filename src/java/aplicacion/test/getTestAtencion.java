package aplicacion.test;

import aplicacion.hibernate.dao.IAtencionDAO;
import aplicacion.dao.imp.AtencionDAOImp;
import aplicacion.modelo.dominio.Atencion;
import aplicacion.modelo.dominio.Mascota;
import aplicacion.modelo.dominio.Medicamento;
import aplicacion.modelo.dominio.PropietarioMascota;
import aplicacion.modelo.dominio.Vacuna;
import java.time.Instant;
import java.util.Date;

/**
 *
 * @author clavedesol
 */
public class getTestAtencion {

    public static void main(String[] args) {
        Atencion a = new Atencion();
        IAtencionDAO adao = new AtencionDAOImp();
        Vacuna v = new Vacuna("ABee", "AntiRabica", "hhhjj", Date.from(Instant.now()), true);
        Mascota ms = new Mascota("22422", "inas", "can", "h4", "pitbl", Date.from(Instant.now()), 4, true, v);
        PropietarioMascota pm = new PropietarioMascota("347657365", "pablo", "mamani", "calle 2", "2345645", "@hotmail", true);
        Medicamento md = new Medicamento("1233", "curaPata", Date.from(Instant.now()), "pastilla", true);

        a.setIdAtencionMedica("167");
        a.setFechaAtencionMedica(Date.from(Instant.now()));
        a.setDiagnostico("reservado");
        a.setObservacion("REPOSO");
        a.setMascota(ms);
        a.setPropietarioMascota(pm);
        a.setMedicamento(md);
        a.setEstado(Boolean.TRUE);

        adao.create(a);
    }
}
