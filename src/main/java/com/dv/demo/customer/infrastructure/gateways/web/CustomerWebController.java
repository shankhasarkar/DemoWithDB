package com.dv.demo.customer.infrastructure.gateways.web;

import com.dv.demo.customer.Service;
import com.dv.demo.customer.core.models.Customer;
import com.dv.demo.customer.infrastructure.exceptions.ServiceException;
import com.dv.demo.customer.infrastructure.exceptions.WebControllerException;
import com.dv.demo.customer.ports.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/customers")
public class CustomerWebController
{
    Service mService;

    @Autowired
    public CustomerWebController(IRepository aRepo)
    {
        mService = new Service(aRepo);

    }

    @PostMapping(path = "",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> registerCustomer(@RequestBody Customer newCustomer) throws WebControllerException {
        try
        {
            mService.registerCustomer(newCustomer);
            return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
        }catch(ServiceException se)
        {
            throw new WebControllerException(se);
        }
    }


    @GetMapping(value = "")
    public ResponseEntity<Iterable<Customer>> getAll() throws WebControllerException {
        try
        {
            return new ResponseEntity<>(mService.fetchCustomers(), HttpStatus.OK);
        }catch(ServiceException se)
        {
            throw new WebControllerException(se);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getById(@PathVariable String id) throws WebControllerException {
        try {
            Optional<Customer> customer = mService.fetchCustomer(id);
            if (customer.isPresent()) {
                return new ResponseEntity<>(customer.get(), HttpStatus.OK);
            } else {
                throw new WebControllerException("Could not find customer with id " + id);
            }
        }catch(ServiceException se)
        {
            throw new WebControllerException(se);
        }
    }
}
