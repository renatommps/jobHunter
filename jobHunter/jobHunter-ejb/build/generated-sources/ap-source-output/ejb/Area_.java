package ejb;

import ejb.Vaga;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-07T19:06:38")
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile SetAttribute<Area, Vaga> vagas;
    public static volatile SingularAttribute<Area, String> nome;
    public static volatile SingularAttribute<Area, Integer> id;

}