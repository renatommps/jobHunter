/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed_beans;

import ejb.Area;
import ejb.AreaFachada;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author 18100871
 */
@Named(value = "areaMBean")
@Dependent
public class AreaMBean {

    @EJB
    private AreaFachada areaFachada;

    /**
     * Creates a new instance of AreaMBean
     */
    public AreaMBean() {
    }
    
    public List<Area> getListaAreas() {
        return areaFachada.getListaAreas();
    }
}
