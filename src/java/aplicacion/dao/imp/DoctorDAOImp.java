package aplicacion.dao.imp;

import aplicacion.dao.IDoctorDAO;
import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.modelo.constantes.TipoDoctor;
import aplicacion.modelo.dominio.Doctor;
import java.io.Serializable;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author EZEQUIEL
 */
public class DoctorDAOImp implements Serializable, IDoctorDAO {

    @Override
    public Doctor validarUsuario(String nombreUsuario, String password) {
        Doctor usuario = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Doctor.class);
        criteria.add(Restrictions.like("nombreUsuario", nombreUsuario));
        criteria.add(Restrictions.like("password", password));
        criteria.add(Restrictions.like("tipoUsuario", TipoDoctor.ADMIN));
        if (!criteria.list().isEmpty()) {
            usuario = (Doctor) criteria.list().get(0);
        }
        return usuario;
    }

    @Override
    public void create(Doctor doctor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(doctor);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificar(Doctor unUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Doctor obtenerUsuario(String nombreUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
