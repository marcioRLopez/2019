/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacion.Dao;

import aplicacion.modelo.dominio.Mascota;
import java.util.List;



/**
 * @author dba
 */
public interface IMascotaDao  {
    public List<Mascota> obtenerTodos();
    public void crear(Mascota mascota);
    public void modificar(Mascota mascota);
    public void eliminar(Mascota mascota);
    public Mascota obtenerPaciente(int historiaclinica);
}
