/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao;

/**
 *
 * @author Alejandro
 */
public interface IGenericDAO<T, ID> {
    void crear(T object);
    void eliminar(T object);
    void modificar(T object);
}
