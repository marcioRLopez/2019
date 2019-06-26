package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IPropietarioDAO;

import aplicacion.modelo.dominio.PropietarioMascota;
import java.io.Serializable;
import org.hibernate.Session;

public class PropietarioMascotaDAOImp implements Serializable, IPropietarioDAO {

    @Override
    public void create(PropietarioMascota propietario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(propietario);
        session.getTransaction().commit();
        session.close();
    }

}
