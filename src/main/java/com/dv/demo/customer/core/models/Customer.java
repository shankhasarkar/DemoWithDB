package com.dv.demo.customer.core.models;

import com.dv.demo.customer.infrastructure.exceptions.RepositoryException;
import com.dv.demo.customer.infrastructure.exceptions.ValidationException;
import com.dv.demo.customer.ports.IRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@Data
@AllArgsConstructor
public class Customer {
    private String firstName;
    private String lastName;
    private String loyaltyId;
    private Date birthDate;

    public void validate() throws ValidationException
    {
        if(firstName == null || firstName.trim().length() == 0)
            throw new ValidationException("First Name is required");
        if(lastName == null || lastName.trim().length() == 0)
            throw new ValidationException("Last Name is required");
        if (birthDate == null)
            throw new ValidationException("BirthDate is required");
    }

    public void store(IRepository aRepository) throws RepositoryException
    {
        aRepository.store(this);
    }
}
