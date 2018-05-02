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
 * @author renato
 */
@Stateless
@LocalBean
public class VagaFachada {

    @PersistenceContext(unitName = "jobHunter-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    // Metodo que retorna a lista de vagas armazenada na tabela Vaga
    public List<ejb.Vaga> getListaVagas() {
 
        Query query = em.createNamedQuery("Vaga.findAll");
        return query.getResultList();
    }
    
    // Metodo que retorna a lista de vagas armazenada na tabela Vaga
    public List<ejb.VagaFormatada> getListaVagasFormatadas() {
        String sql = "SELECT " +
            "    v.LOCAL_DE_TRABALHO," +
            "    v.REQUISITOS," +
            "    v.SALARIO," +
            "    v.EMPRESA," +
            "    v.HORARIO_DE_TRABALHO," +
            "    a.NOME" +
            "FROM app.vaga as v join APP.AREA as a on v.VAGA_ID = a.id" +
            "    where v.ABERTA = 'true'";
        
        Query query = em.createNativeQuery(sql);
        return query.getResultList();
    }
}
