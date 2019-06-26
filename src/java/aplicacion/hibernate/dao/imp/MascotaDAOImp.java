/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IMascotaDAO;
import aplicacion.modelo.dominio.Mascota;
import java.io.Serializable;
import org.hibernate.Session;

/**
 *
 * @author Alejandro
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
