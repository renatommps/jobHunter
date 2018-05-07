/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 18100871
 */
@Entity
@Table(name = "VAGA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vaga.findAll", query = "SELECT v FROM Vaga v")
    , @NamedQuery(name = "Vaga.findByVagaId", query = "SELECT v FROM Vaga v WHERE v.vagaId = :vagaId")
    , @NamedQuery(name = "Vaga.findByLocalDeTrabalho", query = "SELECT v FROM Vaga v WHERE v.localDeTrabalho = :localDeTrabalho")
    , @NamedQuery(name = "Vaga.findByRequisitos", query = "SELECT v FROM Vaga v WHERE v.requisitos = :requisitos")
    , @NamedQuery(name = "Vaga.findBySalario", query = "SELECT v FROM Vaga v WHERE v.salario = :salario")
    , @NamedQuery(name = "Vaga.findByEmpresa", query = "SELECT v FROM Vaga v WHERE v.empresa = :empresa")
    , @NamedQuery(name = "Vaga.findByHorarioDeTrabalho", query = "SELECT v FROM Vaga v WHERE v.horarioDeTrabalho = :horarioDeTrabalho")
    , @NamedQuery(name = "Vaga.findByAberta", query = "SELECT v FROM Vaga v WHERE v.aberta = :aberta")
    , @NamedQuery(name = "Vaga.findByAreaId", query = "SELECT v FROM Vaga v WHERE v.areaId = :areaId")
    , @NamedQuery(name = "Vaga.findAllWithArea", query =  "SELECT  v.LOCAL_DE_TRABALHO v.REQUISITOS, v.SALARIO, v.EMPRESA, " +
            "v.HORARIO_DE_TRABALHO a.NOME FROM app.vaga as v join areas a on v.VAGA_ID = a.id where v.ABERTA = 'true'")})

public class Vaga implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "VAGA_ID")
    private Integer vagaId;
    @Size(max = 100)
    @Column(name = "LOCAL_DE_TRABALHO")
    private String localDeTrabalho;
    @Size(max = 200)
    @Column(name = "REQUISITOS")
    private String requisitos;
    @Column(name = "SALARIO")
    private Integer salario;
    @Size(max = 60)
    @Column(name = "EMPRESA")
    private String empresa;
    @Size(max = 100)
    @Column(name = "HORARIO_DE_TRABALHO")
    private String horarioDeTrabalho;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ABERTA")
    private String aberta;
    @Column(name = "AREA_ID")
    private Integer areaId;

    @OneToMany(mappedBy="area")
    Set<Area> areas;
    
    public Vaga() {
    }

    public Vaga(Integer vagaId) {
        this.vagaId = vagaId;
    }

    public Vaga(Integer vagaId, String aberta) {
        this.vagaId = vagaId;
        this.aberta = aberta;
    }

    public Integer getVagaId() {
        return vagaId;
    }

    public void setVagaId(Integer vagaId) {
        this.vagaId = vagaId;
    }

    public String getLocalDeTrabalho() {
        return localDeTrabalho;
    }

    public void setLocalDeTrabalho(String localDeTrabalho) {
        this.localDeTrabalho = localDeTrabalho;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getHorarioDeTrabalho() {
        return horarioDeTrabalho;
    }

    public void setHorarioDeTrabalho(String horarioDeTrabalho) {
        this.horarioDeTrabalho = horarioDeTrabalho;
    }

    public String getAberta() {
        return aberta;
    }

    public void setAberta(String aberta) {
        this.aberta = aberta;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vagaId != null ? vagaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vaga)) {
            return false;
        }
        Vaga other = (Vaga) object;
        if ((this.vagaId == null && other.vagaId != null) || (this.vagaId != null && !this.vagaId.equals(other.vagaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.Vaga[ vagaId=" + vagaId + " ]";
    }
    
}
