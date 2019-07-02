package aplicacion.test;

import aplicacion.hibernate.dao.IMascotaDAO;
import aplicacion.dao.imp.MascotaDAOImp;
import aplicacion.modelo.dominio.Mascota;
import aplicacion.modelo.dominio.Vacuna;
import java.time.Instant;
import java.util.Date;

/**
 *
 * @author clavedesol
 */
public class getTestMascota {

    public static void main(String[] args) {
        
        Mascota ma = new Mascota();
        IMascotaDAO madao = new MascotaDAOImp();
        Vacuna va = new Vacuna("445", "ravic", "4444a", Date.from(Instant.now()), true);
        
        ma.setIdMascota("11V");
        ma.setNombre("PACO");
        ma.setEspecie("perro");
        ma.setSexo("MACHO");
        ma.setRaza("CANICHE");
        ma.setFechaNacimiento(Date.from(Instant.now()));
        ma.setPeso(4);
        ma.setEstado(Boolean.TRUE);
        ma.setVacuna(va);
        madao.crear(ma);
    }
}
