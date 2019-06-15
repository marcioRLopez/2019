package aplicacion.dao;

import aplicacion.modelo.dominio.Atencion;
import aplicacion.modelo.dominio.Mascota;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Grupo10
 */
public interface IAtencionMedicaDAO {

    /**
     * crea una atención médica
     *
     * @param atencionMedica de tipo AtencionMedica
     */
    public void crearAtencion(Atencion atencionMedica);

    /**
     * metodo para modificar un objeto de tipo AtencionMedica
     *
     * @param atencionMedica de tipo AtencionMedica
     */
    public void modificarAtencion(Atencion atencionMedica);

    /**
     * metodo para borrar un objeto de tipo AtencionMedica
     *
     * @param atencionMedica de tipo AtencionMedica
     */
    public void borrarAtencion(Atencion atencionMedica);

    /**
     * metodo que retorna una lista de atenciones médicas realizadas dentro de
     * un rango de fechas
     *
     * @return AtencionMedica
     * @param fechaDesde de tipo Date
     * @param fechaHasta de tipo Date
     * @param mascota
     */
    public List<Atencion> mostrarPorRangoFecha(Date fechaDesde, Date fechaHasta, Mascota mascota);

    /**
     * metodo para obtener toda la lista de atenciones medicas
     *
     * @return AtencionMedica
     */
    public List<Atencion> obtenerTodxs();

    /**
     * metodo para obtener toda la lista de atenciones medicas
     *
     * @return AtencionMedica
     */
    public List<Atencion> obtenerTodxsAtenciones();
}
