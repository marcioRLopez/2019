package aplicacion.test;


import aplicacion.hibernate.dao.IPropietarioDAO;
import aplicacion.dao.imp.PropietarioMascotaDAOImp;
import aplicacion.modelo.dominio.PropietarioMascota;

/**
 *
 * @author clavedesol
 */
public class getTesPropietario {

    public static void main(String[] args) {

        PropietarioMascota unPropietario = new PropietarioMascota();
        IPropietarioDAO propietarioMascotaDAO = new PropietarioMascotaDAOImp();

        unPropietario.setDni("32567895");
        unPropietario.setNombre("mark");
        unPropietario.setApellido("jones");
        unPropietario.setDireccion("linea");
        unPropietario.setTelefono("23428903");
        unPropietario.setCorreoElectronico("@gmail");
        unPropietario.setEstado(Boolean.TRUE);

        propietarioMascotaDAO.create(unPropietario);
    }
}
