package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Mascota;
import java.util.List;

/**
 *
 * @author clavedesol
 */
public interface IMascotaDAO {

    void crear(Mascota mascota);

    List<Mascota> obtenerListaMascota();

    public void borrarPaciente(Mascota mascota);

    public Mascota obtenerPaciente(String nombreMascota);

    public void modificarMascota(Mascota mascota);
}
