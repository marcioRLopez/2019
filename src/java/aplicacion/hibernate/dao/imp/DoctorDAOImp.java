/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IDoctorDAO;
import aplicacion.modelo.dominio.Doctor;
import aplicacion.modelo.util.ListadoUsuarios;
import java.io.Serializable;
import org.hibernate.Session;

/**
 *
 * @author Grupo10
 */
public class DoctorDAOImp implements Serializable, IDoctorDAO {

    @Override
    public void create(Doctor doctor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(doctor);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Doctor validarUsuario(String nombreUsuario, String password) {
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

    @Override
    public void modificarUsuario(Doctor unUsuario) {
        boolean encontrado = false;
        for (int i = 0; i < ListadoUsuarios.tablaUsuarios.length && encontrado != true; i++) {
            Doctor usuarioListado = ListadoUsuarios.tablaUsuarios[i];
            if (usuarioListado.getNombreUsuario().equals(unUsuario.getNombreUsuario())) {
                ListadoUsuarios.tablaUsuarios[i] = unUsuario;
                encontrado = true;
            }
        }

    }

    @Override
    public Doctor obtenerUsuario(String nombreUsuario) {
        Doctor usuario = null;
        for (int i = 0; i < ListadoUsuarios.tablaUsuarios.length; i++) {
            if (ListadoUsuarios.tablaUsuarios[i] != null) {
                if (ListadoUsuarios.tablaUsuarios[i].getNombreUsuario().equals(nombreUsuario)) {
                    usuario = ListadoUsuarios.tablaUsuarios[i];
                    break;
                }
            }
        }
        return usuario;
    }

}
