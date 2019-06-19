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
 * @author usuario
 */
public class TestGetDoctor {
    public static void main(String[] args) {
        IDoctorDAO doctorDAO = new DoctorDAOImp();
        Doctor unDoctor = new Doctor("avega", "avega", "vega@gmail.com", true, "Vega, Ariel Alejandro");
        doctorDAO.create(unDoctor);
        //System.out.println("El nombre del usuario es: "+unDoctor.getNombreUsuario());
    }
    
}
