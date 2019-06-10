package aplicacion.modelo.util;

import aplicacion.modelo.dominio.AtencionMedica;
import java.util.List;

/**
 *
 * @author Grupo10
 */
public class ListadoAtencionMedica {

    //Lista para guardar atenciones médicas
    private static List<AtencionMedica> tablaAtencionesMedicas;

    public ListadoAtencionMedica() {
    }

    //Métodos accesores
    /**
     * @return the tablaAtencionesMedicas
     */
    public static List<AtencionMedica> getTablaAtencionesMedicas() {
        return tablaAtencionesMedicas;
    }

    /**
     * @param aTablaAtencionesMedicas the tablaAtencionesMedicas to set
     */
    public static void setTablaAtencionesMedicas(List<AtencionMedica> aTablaAtencionesMedicas) {
        tablaAtencionesMedicas = aTablaAtencionesMedicas;
    }

}
