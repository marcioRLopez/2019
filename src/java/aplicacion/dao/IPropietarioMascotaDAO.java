package aplicacion.dao;

import aplicacion.modelo.dominio.PropietarioMascota;
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
    public void agregarDuenioMascota(PropietarioMascota duenioMascota);

    /**
     * Modifica un propietario de la mascota
     *
     * @param duenioMascota de tipo PropietarioMascota
     */
    public void modificarDuenioMascota(PropietarioMascota duenioMascota);

    /**
     * Elimina un propietario de la mascota
     *
     * @param duenioMascota de tipo PropietarioMascota
     */
    public void borrarDuenioMascota(PropietarioMascota duenioMascota);

    /**
     * metodo que retorna una lista de propietarios de las mascotas
     *
     * @return PropietarioMascota
     */
    public List<PropietarioMascota> obtenerTodxs();
}
