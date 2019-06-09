package aplicacion.modelo.util;

import aplicacion.modelo.dominio.DuenioMascota;
import java.util.List;

/**
 *
 * @author EZEQUIEL
 */
public class ListadoDuenioMascota {

//Lista de los dueños de la/s mascota/s
    private static List<DuenioMascota> tablaDueñosMascotas;

    public ListadoDuenioMascota() {
    }

    //Métodos accesores
    /**
     * @return the tablaDueñosMascotas
     */
    public static List<DuenioMascota> getTablaDueñosMascotas() {
        return tablaDueñosMascotas;
    }

    /**
     * @param aTablaDueñosMascotas the tablaDueñosMascotas to set
     */
    public static void setTablaDueñosMascotas(List<DuenioMascota> aTablaDueñosMascotas) {
        tablaDueñosMascotas = aTablaDueñosMascotas;
    }

}
