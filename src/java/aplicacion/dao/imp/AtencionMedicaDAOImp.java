package aplicacion.dao.imp;

import aplicacion.dao.IAtencionMedicaDAO;
import aplicacion.modelo.dominio.Atencion;
import aplicacion.modelo.dominio.Mascota;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Grupo10
 */
public class AtencionMedicaDAOImp implements IAtencionMedicaDAO{

    @Override
    public void crearAtencion(Atencion atencionMedica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarAtencion(Atencion atencionMedica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarAtencion(Atencion atencionMedica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Atencion> mostrarPorRangoFecha(Date fechaDesde, Date fechaHasta, Mascota mascota) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Atencion> obtenerTodxs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Atencion> obtenerTodxsAtenciones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
