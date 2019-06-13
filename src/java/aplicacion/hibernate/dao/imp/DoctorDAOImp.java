/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IDoctorDAO;
import aplicacion.modelo.dominio.Doctor;
import java.io.Serializable;
import org.hibernate.Session;

/**
 *
 * @author Grupo10
 */
public class DoctorDAOImp implements Serializable, IDoctorDAO{

    @Override
    public void create(Doctor doctor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(doctor);
        session.getTransaction().commit();
        session.close();
    }
    
    
}
