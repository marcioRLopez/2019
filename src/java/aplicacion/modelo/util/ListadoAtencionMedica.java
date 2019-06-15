package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Atencion;
import java.util.List;

/**
 *
 * @author Grupo10
 */
public class ListadoAtencionMedica {

    //Lista para guardar atenciones médicas
    private static List<Atencion> tablaAtencionesMedicas;

    public ListadoAtencionMedica() {
    }

    //Métodos accesores
    /**
     * @return the tablaAtencionesMedicas
     */
    public static List<Atencion> getTablaAtencionesMedicas() {
        return tablaAtencionesMedicas;
    }

    /**
     * @param aTablaAtencionesMedicas the tablaAtencionesMedicas to set
     */
    public static void setTablaAtencionesMedicas(List<Atencion> aTablaAtencionesMedicas) {
        tablaAtencionesMedicas = aTablaAtencionesMedicas;
    }

}
