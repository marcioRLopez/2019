package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IPropietarioMascotaDAO;

import aplicacion.modelo.dominio.PropietarioMascota;
import java.io.Serializable;
import org.hibernate.Session;


public class PropietarioMascotaDAOImp implements Serializable, IPropietarioMascotaDAO{

    @Override
    public void create(PropietarioMascota unPropietario) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public void modificar(PropietarioMascota unPropietario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PropietarioMascota obtenerPropietario(String unPropietario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
