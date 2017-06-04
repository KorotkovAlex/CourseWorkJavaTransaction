package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Request;
import model.Role;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-04T19:41:57")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> firstName;
    public static volatile SingularAttribute<User, String> lastName;
    public static volatile SingularAttribute<User, String> password;
    public static volatile ListAttribute<User, Request> requestList;
    public static volatile SingularAttribute<User, String> phone;
    public static volatile SingularAttribute<User, Boolean> isOffer;
    public static volatile SingularAttribute<User, String> login;
    public static volatile ListAttribute<User, Role> roleList;

}