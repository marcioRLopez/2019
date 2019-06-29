package aplicacion.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IMascotaDAO;
import aplicacion.modelo.dominio.Mascota;
import java.io.Serializable;
import org.hibernate.Session;

/**
 *
 * @author EZEQUIEL
 */
public class MascotaDAOImp implements Serializable, IMascotaDAO {

    @Override
    public void create(Mascota mascota) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(mascota);
        session.getTransaction().commit();
        session.close();
    }

}
