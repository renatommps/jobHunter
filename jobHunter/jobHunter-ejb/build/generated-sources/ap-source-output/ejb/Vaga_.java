package ejb;

import ejb.Area;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-07T19:06:38")
@StaticMetamodel(Vaga.class)
public class Vaga_ { 

    public static volatile SingularAttribute<Vaga, Area> area;
    public static volatile SingularAttribute<Vaga, String> aberta;
    public static volatile SingularAttribute<Vaga, Integer> vagaId;
    public static volatile SingularAttribute<Vaga, Integer> areaId;
    public static volatile SingularAttribute<Vaga, String> requisitos;
    public static volatile SingularAttribute<Vaga, Integer> salario;
    public static volatile SingularAttribute<Vaga, String> horarioDeTrabalho;
    public static volatile SingularAttribute<Vaga, String> localDeTrabalho;
    public static volatile SingularAttribute<Vaga, String> empresa;

}