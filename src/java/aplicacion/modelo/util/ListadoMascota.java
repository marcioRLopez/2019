package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Mascota;
import java.util.List;

/**
 *
 * @author EZEQUIEL
 */
public class ListadoMascota {

    //Lista de mascotas
    private static List<Mascota> tablaMascotas;

    public ListadoMascota() {
    }

    //Métodos accesores get y set
    /**
     * @return the tablaMascotas
     */
    public static List<Mascota> getTablaMascotas() {
        return tablaMascotas;
    }

    /**
     * @param aTablaMascotas the tablaMascotas to set
     */
    public static void setTablaMascotas(List<Mascota> aTablaMascotas) {
        tablaMascotas = aTablaMascotas;
    }

}
