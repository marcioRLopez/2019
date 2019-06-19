/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IDoctorDAO;
import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.modelo.dominio.Doctor;
import aplicacion.modelo.util.ListadoUsuarios;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Grupo10
 */
public class DoctorDAOImp implements IDoctorDAO {

    @Override
    public Doctor validarUsuario(String nombreUsuario, String password) {
        Doctor usuario = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Doctor.class);
        criteria.add(Restrictions.like("nombreUsuario", nombreUsuario));
        criteria.add(Restrictions.like("password", password));
        criteria.add(Restrictions.eq("estado", true));
        if (!criteria.list().isEmpty()) {
            usuario = (Doctor) criteria.list().get(0);
        }
        return usuario;
    }

    @Override
    public void modificar(Doctor unUsuario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(unUsuario);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Doctor obtenerUsuario(String nombreUsuario) {
        Doctor usuario = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Doctor.class);
        criteria.add(Restrictions.like("nombreUsuario", nombreUsuario));
        if (!criteria.list().isEmpty()) {
            usuario = (Doctor) criteria.list().get(0);
        }
        return usuario;
    }

    @Override
    public Doctor validarUsuario2(String nombreUsuario, String password) {
        Doctor usuario = null;
        for (int i = 0; i < ListadoUsuarios.tablaUsuarios.length; i++) {
            if (ListadoUsuarios.tablaUsuarios[i] != null) {
                if (ListadoUsuarios.tablaUsuarios[i].getNombreUsuario().equals(nombreUsuario) && ListadoUsuarios.tablaUsuarios[i].getPassword().equals(password)) {
                    usuario = ListadoUsuarios.tablaUsuarios[i];
                    break;
                }
            }

        }
        return usuario;
    }

}
