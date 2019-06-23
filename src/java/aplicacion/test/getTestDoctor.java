package aplicacion.test;

import aplicacion.dao.IDoctorDAO;
import aplicacion.dao.imp.DoctorDAOImp;
import aplicacion.modelo.constantes.TipoDoctor;
import aplicacion.modelo.dominio.Doctor;

/**
 *
 * @author EZEQUIEL
 */
public class getTestDoctor {
    
    public static void main(String[] args) {
        Doctor primerDoctor = new Doctor();
        IDoctorDAO doctorDAO = new DoctorDAOImp();
        
        primerDoctor.setNombreUsuario("admin");
        primerDoctor.setPassword("clavedesol");
        primerDoctor.setTipoUsuario(TipoDoctor.ADMIN);
        doctorDAO.create(primerDoctor);
    }
}