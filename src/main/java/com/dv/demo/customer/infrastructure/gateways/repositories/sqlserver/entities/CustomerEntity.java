package com.dv.demo.customer.infrastructure.gateways.repositories.sqlserver.entities;

import com.dv.demo.customer.core.models.Customer;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Data
@Entity
@Table(name = "wfa_customer")
@NoArgsConstructor
public class CustomerEntity {
    @Id private String loyaltyId;
    private String firstName;
    private String lastName;
    private Date birthDate;

    public CustomerEntity(Customer aCustomer)
    {
        loyaltyId = aCustomer.getLoyaltyId();
        firstName = aCustomer.getFirstName();
        lastName = aCustomer.getLastName();
        birthDate = aCustomer.getBirthDate();
    }

    public Customer toCustomer(){
        return new Customer(firstName,lastName,loyaltyId,birthDate);
    }

}
