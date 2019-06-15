package aplicacion.dao;

import aplicacion.modelo.dominio.Propietariomascota;
import java.util.List;

/**
 *
 * @author Grupo10
 */
public interface IPropietarioMascotaDAO {

    /**
     * Crea un propietario de la mascota
     *
     * @param duenioMascota de tipo PropietarioMascota
     */
    public void agregarDuenioMascota(Propietariomascota duenioMascota);

    /**
     * Modifica un propietario de la mascota
     *
     * @param duenioMascota de tipo PropietarioMascota
     */
    public void modificarDuenioMascota(Propietariomascota duenioMascota);

    /**
     * Elimina un propietario de la mascota
     *
     * @param duenioMascota de tipo PropietarioMascota
     */
    public void borrarDuenioMascota(Propietariomascota duenioMascota);

    /**
     * metodo que retorna una lista de propietarios de las mascotas
     *
     * @return PropietarioMascota
     */
    public List<Propietariomascota> obtenerTodxs();
}
