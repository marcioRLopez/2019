package aplicacion.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IPropietarioDAO;

import aplicacion.modelo.dominio.PropietarioMascota;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class PropietarioMascotaDAOImp implements Serializable, IPropietarioDAO {

    @Override
    public void create(PropietarioMascota propietario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(propietario);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificarPropietario(PropietarioMascota propietario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarPropietario(PropietarioMascota propietario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarPropietario(PropietarioMascota propietario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PropietarioMascota obtenerPropietario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PropietarioMascota> obtenerTodos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(PropietarioMascota.class);
        List<PropietarioMascota> propietarios = criteria.list();
        session.close();
        return propietarios;
    }

}
