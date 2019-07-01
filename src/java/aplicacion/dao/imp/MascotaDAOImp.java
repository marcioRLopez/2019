package aplicacion.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IMascotaDAO;
import aplicacion.modelo.dominio.Mascota;
import aplicacion.modelo.dominio.PropietarioMascota;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author EZEQUIEL
 */
public class MascotaDAOImp implements Serializable, IMascotaDAO {

    @Override
    public void crear(Mascota mascota) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(mascota);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Mascota> obtenerListaMascota() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Mascota.class);
        List<Mascota> mascotas = criteria.list();
        session.close();
        return mascotas;
    }

    @Override
    public Mascota obtenerPaciente(String nombreMascota) {
        Mascota mascota = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Mascota.class);
        criteria.add(Restrictions.like("idMascota", nombreMascota));
        if (!criteria.list().isEmpty()) {
            mascota = (Mascota) criteria.list().get(0);
        }
        return mascota;
    }

    @Override
    public void borrarPaciente(Mascota mascota) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(mascota);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificarMascota(Mascota mascota) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(mascota);
        session.getTransaction().commit();
        session.close();
    }
}
