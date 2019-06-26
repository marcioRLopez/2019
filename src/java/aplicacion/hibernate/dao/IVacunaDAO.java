/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Vacuna;

/**
 *
 * @author Alejandro
 */
public interface IVacunaDAO {

    void create(Vacuna vacuna);

    void modificar();
    

    Vacuna obtenerVacuna(String nombreVacuna);
}
