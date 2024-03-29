/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IGenericDAO;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Alejandro
 */
public class GenericDAOImp <T, ID extends Serializable> implements IGenericDAO<T, ID>{

    @Override
    public void crear(T object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void eliminar(T object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(object); // preguntar al profe si es delete o update(video->update)
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificar(T object) {
       Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(object);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<T> obtenerDatos(Class<T> object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(object);
        List<T> datos = criteria.list();
        session.close();
        return datos;
    }
    
}
