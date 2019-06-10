package aplicacion.dao;

import aplicacion.modelo.dominio.PropietarioDeMascota;
import java.util.List;

/**
 *
 * @author Grupo10
 */
public interface IPropietarioDeMascotaDAO {

    /**
     * Crea un propietario de la mascota
     *
     * @param duenioMascota de tipo PropietarioDeMascota
     */
    public void agregarDuenioMascota(PropietarioDeMascota duenioMascota);

    /**
     * Modifica un propietario de la mascota
     *
     * @param duenioMascota de tipo PropietarioDeMascota
     */
    public void modificarDuenioMascota(PropietarioDeMascota duenioMascota);

    /**
     * Elimina un propietario de la mascota
     *
     * @param duenioMascota de tipo PropietarioDeMascota
     */
    public void borrarDuenioMascota(PropietarioDeMascota duenioMascota);

    /**
     * metodo que retorna una lista de propietarios de las mascotas
     *
     * @return PropietarioDeMascota
     */
    public List<PropietarioDeMascota> obtenerTodxs();
}
