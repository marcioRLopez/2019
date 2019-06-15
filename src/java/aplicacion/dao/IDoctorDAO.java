/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.Doctor;

/**
 *
 * @author Dios salva
 */
public interface IDoctorDAO {
    /**
     * Valida la existencia de un usuario
     * @param nombreUsuario
     * @param password
     * @return null si no existe. 
     */
    Doctor validarUsuario(String nombreUsuario, String password);
    void modificar(Doctor unUsuario);
    Doctor obtenerUsuario(String nombreUsuario);
}
