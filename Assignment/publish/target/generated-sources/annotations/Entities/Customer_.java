package Entities;

import Entities.Address;
import Entities.Subscription;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-09-25T21:06:12")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> firstName;
    public static volatile SingularAttribute<Customer, String> lastName;
    public static volatile CollectionAttribute<Customer, Subscription> subscriptionCollection;
    public static volatile CollectionAttribute<Customer, Address> addressCollection;
    public static volatile SingularAttribute<Customer, Integer> customerID;

}