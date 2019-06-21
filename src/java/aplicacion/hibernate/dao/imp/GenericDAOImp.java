/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IGenericDAO;
import java.io.Serializable;
import org.hibernate.Session;

/**
 *
 * @author Alejandro
 */
public class GenericDAOImp<T, ID extends  Serializable> implements IGenericDAO<T, ID>{

    @Override
    public void create(T object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(T object) {
       Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(object);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(T object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(object);
        session.getTransaction().commit();
        session.close();
    }
    
}
