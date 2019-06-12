package aplicacion.modelo.util;

import aplicacion.modelo.dominio.PropietarioMascota;
import java.util.List;

/**
 *
 * @author Grupo10
 */
public class ListadoPropietarioDeMascota {

//Lista de los dueños de la/s mascota/s
    private static List<PropietarioMascota> tablaDueñosMascotas;

    public ListadoPropietarioDeMascota() {
    }

    //Métodos accesores
    /**
     * @return the tablaDueñosMascotas
     */
    public static List<PropietarioMascota> getTablaDueñosMascotas() {
        return tablaDueñosMascotas;
    }

    /**
     * @param aTablaDueñosMascotas the tablaDueñosMascotas to set
     */
    public static void setTablaDueñosMascotas(List<PropietarioMascota> aTablaDueñosMascotas) {
        tablaDueñosMascotas = aTablaDueñosMascotas;
    }

}
