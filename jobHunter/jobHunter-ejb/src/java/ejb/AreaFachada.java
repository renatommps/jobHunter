/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author 18100871
 */
@Stateless
@LocalBean
public class AreaFachada {

    @PersistenceContext(unitName = "jobHunter-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    // Metodo que retorna a lista de areas armazenada na tabela area
    public List<ejb.Area> getListaAreas() {
        Query query = em.createNamedQuery("Area.findAll");
        return query.getResultList();
    }
}
