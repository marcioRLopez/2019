package aplicacion.dao;

import aplicacion.modelo.dominio.DuenioMascota;
import java.util.List;

/**
 *
 * @author EZEQUIEL
 */
public interface IDuenioMascotaDAO {

    public void agregarDuenioMascota(DuenioMascota duenioMascota);

    public void modificarDuenioMascota(DuenioMascota duenioMascota);

    public void borrarDuenioMascota(DuenioMascota duenioMascota);

    public List<DuenioMascota> obtenerTodxs();
}
