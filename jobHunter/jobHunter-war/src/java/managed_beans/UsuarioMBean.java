/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed_beans;

import ejb.Usuario;
import ejb.UsuarioFachada;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author 18100871
 */
@Named(value = "usuarioMBean")
@Dependent
public class UsuarioMBean {

    @EJB
    private UsuarioFachada usuarioFachada;

    /**
     * Creates a new instance of UsuarioMBean
     */
    public UsuarioMBean() {
    }
    
    public List<Usuario> getListaUsuarios() {
        return usuarioFachada.getListaUsuarios();
    }
}
