package aplicacion.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IVacunaDAO;
import aplicacion.modelo.dominio.Vacuna;
import java.io.Serializable;
import org.hibernate.Session;

public class VacunaDAOImp implements Serializable, IVacunaDAO {

    @Override
    public void create(Vacuna vacuna) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(vacuna);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vacuna obtenerVacuna(String nombreVacuna) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
