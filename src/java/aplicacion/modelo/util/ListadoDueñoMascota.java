package aplicacion.modelo.util;

import aplicacion.modelo.dominio.DueñoMascota;
import java.util.List;

/**
 *
 * @author EZEQUIEL
 */
public class ListadoDueñoMascota {

//Lista de los dueños de la/s mascota/s
    private static List<DueñoMascota> tablaDueñosMascotas;

    public ListadoDueñoMascota() {
    }

    //Métodos accesores
    /**
     * @return the tablaDueñosMascotas
     */
    public static List<DueñoMascota> getTablaDueñosMascotas() {
        return tablaDueñosMascotas;
    }

    /**
     * @param aTablaDueñosMascotas the tablaDueñosMascotas to set
     */
    public static void setTablaDueñosMascotas(List<DueñoMascota> aTablaDueñosMascotas) {
        tablaDueñosMascotas = aTablaDueñosMascotas;
    }

}
