package aplicacion.dao;

import aplicacion.modelo.dominio.PropietarioDeMascota;
import java.util.List;

/**
 *
 * @author EZEQUIEL
 */
public interface IPropietarioDeMascotaDAO {

    public void agregarDuenioMascota(PropietarioDeMascota duenioMascota);

    public void modificarDuenioMascota(PropietarioDeMascota duenioMascota);

    public void borrarDuenioMascota(PropietarioDeMascota duenioMascota);

    public List<PropietarioDeMascota> obtenerTodxs();
}
