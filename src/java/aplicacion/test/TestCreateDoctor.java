/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.dao.IDoctorDAO;
import aplicacion.hibernate.dao.imp.DoctorDAOImp;
import aplicacion.modelo.dominio.Doctor;

/**
 *
 * @author VICO
 */
public class TestCreateDoctor {
    public static void main(String[] args) {
        Doctor primerDoctor = new Doctor();
        primerDoctor.setEstado(Boolean.TRUE);
        primerDoctor.setNombreUsuario("admin");
        primerDoctor.setPassword("password_admin");
        IDoctorDAO doctorDAO = new DoctorDAOImp();
        doctorDAO.create(primerDoctor);
    }
}
