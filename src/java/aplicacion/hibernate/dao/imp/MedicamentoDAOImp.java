/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IMedicamentoDAO;
import aplicacion.modelo.dominio.Medicamento;
import java.io.Serializable;
import org.hibernate.Session;

/**
 *
 * @author Alejandro
 */
public class MedicamentoDAOImp implements Serializable, IMedicamentoDAO {

    @Override
    public void create(Medicamento medicamento) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(medicamento);
        session.getTransaction().commit();
        session.close();
    }

}
