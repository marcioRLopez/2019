package aplicacion.dao;

import aplicacion.modelo.dominio.AtencionMedica;
import aplicacion.modelo.dominio.Mascota;
import java.util.Date;
import java.util.List;

/**
 *
 * @author EZEQUIEL
 */
public interface IAtencionMedicaDAO {

    public void crearAtencion(AtencionMedica atencionMedica);

    public void modificarAtencion(AtencionMedica atencionMedica);

    public void borrarAtencion(AtencionMedica atencionMedica);

    public List<AtencionMedica> mostrarPorRangoFecha(Date fechaDesde, Date fechaHasta, Mascota mascota);

    public List<AtencionMedica> obtenerTodxs();

    public List<AtencionMedica> obtenerTodxsAtenciones();
}
