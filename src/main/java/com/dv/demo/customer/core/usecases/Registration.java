package com.dv.demo.customer.core.usecases;

import com.dv.demo.customer.core.models.Customer;
import com.dv.demo.customer.infrastructure.exceptions.RepositoryException;
import com.dv.demo.customer.infrastructure.exceptions.UsecaseException;
import com.dv.demo.customer.infrastructure.exceptions.ValidationException;
import com.dv.demo.customer.ports.IRepository;

public class Registration {

    public void register(Customer aCustomer, IRepository aRepository) throws UsecaseException {
        try {
            aCustomer.validate();
            aCustomer.store(aRepository);
        } catch (ValidationException ve) {
            throw new UsecaseException(ve);
        } catch (RepositoryException re) {
            throw new UsecaseException(re);
        }
    }
}
