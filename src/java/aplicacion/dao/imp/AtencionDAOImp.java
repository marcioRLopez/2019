/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IAtencionDAO;
import aplicacion.modelo.dominio.Atencion;
import java.io.Serializable;
import org.hibernate.Session;

/**
 *
 * @author Alejandro
 */
public class AtencionDAOImp implements Serializable, IAtencionDAO {

    @Override
    public void create(Atencion atencion) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(atencion);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void actualizarAtencion(Atencion atencion) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(atencion);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void borrarAtencion(Atencion atencion) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(atencion);
        session.getTransaction().commit();
        session.close();
    }

}
