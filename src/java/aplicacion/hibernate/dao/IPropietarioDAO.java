package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.PropietarioMascota;
import java.util.List;

/**
 *
 * @author clavedesol
 */
public interface IPropietarioDAO {

    void create(PropietarioMascota propietario);

    PropietarioMascota obtenerPropietario();

    public void modificarPropietario(PropietarioMascota propietario);

    public void agregarPropietario(PropietarioMascota propietario);

    public void eliminarPropietario(PropietarioMascota propietario);

    List<PropietarioMascota> obtenerTodos();
}
