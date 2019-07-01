package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Atencion;

/**
 *
 * @author clavedesol
 */
public interface IAtencionDAO {

    void create(Atencion atencion);

    public void actualizarAtencion(Atencion atencion);

    public void borrarAtencion(Atencion atencion);
}
