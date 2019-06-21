package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IDoctorDAO;
import aplicacion.modelo.dominio.Doctor;
import java.io.Serializable;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Grupo10
 */
public class DoctorDAOImp extends GenericDAOImp<Doctor, String> implements Serializable, IDoctorDAO {

    @Override
    public Doctor getDoctor(String nombre, String password) {
        Doctor doctor = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Doctor.class);
        criteria.add(Restrictions.like("nombreUsuario", nombre));
        criteria.add(Restrictions.like("password", password));
        if (!criteria.list().isEmpty()){
            doctor = (Doctor)criteria.list().get(0);
        }
        return doctor;
        
    }

}
