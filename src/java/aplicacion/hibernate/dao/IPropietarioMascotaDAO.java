/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.PropietarioMascota;

/**
 *
 * @author Alejandro
 */
public interface IPropietarioMascotaDAO {

    void create(PropietarioMascota unPropietario);

    void modificar(PropietarioMascota unPropietario);

    PropietarioMascota obtenerPropietario(String unPropietario);
}
