/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed_beans;

import ejb.Vaga;
import ejb.VagaFachada;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author renato
 */
@Named(value = "vagaMBean")
@Dependent
public class VagaMBean {
    
    @EJB
    private VagaFachada vagaFachada;

    /**
     * Creates a new instance of VagaMBean
     */
    public VagaMBean() {
    }
    
    public List<Vaga> getListaVagas() {
        return vagaFachada.getListaVagas();
    }
    
    public List<VagaFormatada> getListaVagasFormatadas {
        return vagaFachada.getListaVagasFormatadas();
    }
    
}
