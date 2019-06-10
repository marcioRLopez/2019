
package aplicacion.Dao;

import aplicacion.modelo.dominio.Mascota;
import java.util.List;

/**
 * @author Grupo10
 */
public interface IMascotaDao {

    /**
     * @return List de Mascotas
     */
    public List<Mascota> obtenerTodos();

    /**
     * crea un paciente mascota
     *
     * @param mascota de tipo Mascota
     */
    public void crear(Mascota mascota);

    /**
     * metodo para modificar un objeto de tipo Mascota
     *
     * @param mascota
     */
    public void modificar(Mascota mascota);

    /**
     * metodo para borrar un paciente mascota
     *
     * @param mascota
     */
    public void eliminar(Mascota mascota);

    /**
     * @return Mascota un paciente mascota
     *
     * @param historiaclinica
     */
    public Mascota obtenerPaciente(int historiaclinica);
}
