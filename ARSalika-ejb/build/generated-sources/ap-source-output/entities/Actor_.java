package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-09T09:30:10")
@StaticMetamodel(Actor.class)
public class Actor_ { 

    public static volatile SingularAttribute<Actor, String> firstName;
    public static volatile SingularAttribute<Actor, String> lastName;
    public static volatile SingularAttribute<Actor, Integer> actorId;
    public static volatile SingularAttribute<Actor, Date> lastUpdate;

}