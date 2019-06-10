package aplicacion.dao.imp;

import aplicacion.dao.IAtencionMedicaDAO;
import aplicacion.modelo.dominio.AtencionMedica;
import aplicacion.modelo.dominio.Mascota;
import java.util.Date;
import java.util.List;

/**
 *
 * @author clavedesol
 */
public class AtencionMedicaDAOImp implements IAtencionMedicaDAO{

    @Override
    public void crearAtencion(AtencionMedica atencionMedica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarAtencion(AtencionMedica atencionMedica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarAtencion(AtencionMedica atencionMedica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AtencionMedica> mostrarPorRangoFecha(Date fechaDesde, Date fechaHasta, Mascota mascota) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AtencionMedica> obtenerTodxs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AtencionMedica> obtenerTodxsAtenciones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
