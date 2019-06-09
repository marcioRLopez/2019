package aplicacion.modelo.util;

import aplicacion.modelo.dominio.PropietarioDeMascota;
import java.util.List;

/**
 *
 * @author EZEQUIEL
 */
public class ListadoPropietarioDeMascota {

//Lista de los dueños de la/s mascota/s
    private static List<PropietarioDeMascota> tablaDueñosMascotas;

    public ListadoPropietarioDeMascota() {
    }

    //Métodos accesores
    /**
     * @return the tablaDueñosMascotas
     */
    public static List<PropietarioDeMascota> getTablaDueñosMascotas() {
        return tablaDueñosMascotas;
    }

    /**
     * @param aTablaDueñosMascotas the tablaDueñosMascotas to set
     */
    public static void setTablaDueñosMascotas(List<PropietarioDeMascota> aTablaDueñosMascotas) {
        tablaDueñosMascotas = aTablaDueñosMascotas;
    }

}
