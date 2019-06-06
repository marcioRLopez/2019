package aplicacion.controlador.beans;

import aplicacion.dao.IUsuarioDao;
import aplicacion.dao.imp.IUsuarioDaoImp;
import aplicacion.modelo.dominio.User;
import aplicacion.modelo.dominio.Usuario;
import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 *
 * @author clavedesol
 */
@ManagedBean
@RequestScoped
public class UsuarioBean {

    /**
     * atributo de tipo objeto Usuario
     */
    private Usuario usuario;

    /**
     * crea un nueva instancia de UsuarioBean
     */
    public UsuarioBean() {
        if (usuario != null) {
            String nombreUsuario = usuario.getNombreUsuario();
            IUsuarioDao usuarioDao = new IUsuarioDaoImp();
            usuario = usuarioDao.obtenerUsuario(nombreUsuario);
            if (usuario.getUser() == null) {
                usuario.setUser(new User());
            }
        }
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
