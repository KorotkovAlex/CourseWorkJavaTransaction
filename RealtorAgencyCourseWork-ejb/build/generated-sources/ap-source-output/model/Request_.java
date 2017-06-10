package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Criterion;
import model.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-09T00:16:16")
@StaticMetamodel(Request.class)
public class Request_ { 

    public static volatile SingularAttribute<Request, User> userLogin;
    public static volatile ListAttribute<Request, Criterion> criterionList;
    public static volatile SingularAttribute<Request, String> name;
    public static volatile SingularAttribute<Request, Integer> id;
    public static volatile SingularAttribute<Request, Date> time;
    public static volatile SingularAttribute<Request, String> type;

}