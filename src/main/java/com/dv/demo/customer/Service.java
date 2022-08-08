package com.dv.demo.customer;

import com.dv.demo.customer.core.models.Customer;
import com.dv.demo.customer.core.usecases.Registration;
import com.dv.demo.customer.infrastructure.exceptions.ServiceException;
import com.dv.demo.customer.infrastructure.exceptions.UsecaseException;
import com.dv.demo.customer.ports.IRepository;

import java.util.Optional;

public class Service
{
    private IRepository mRepository;


    public Service (IRepository aRepository)
    {
        mRepository = aRepository;
    }

    public void registerCustomer(Customer aCustomer) throws ServiceException
    {
        Registration registration = new Registration();
        try
        {
            registration.register(aCustomer, mRepository);
        }catch(UsecaseException ue)
        {
            throw new ServiceException(ue);
        }
    }

    public Optional<Customer> fetchCustomer(String aCustomerId) throws ServiceException
    {
            return mRepository.fetchCustomer(aCustomerId);
    }

    public Iterable<Customer> fetchCustomers() throws ServiceException
    {
        return mRepository.fetchAllCustomers();
    }
}
