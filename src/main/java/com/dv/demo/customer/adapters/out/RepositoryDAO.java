package com.dv.demo.customer.adapters.out;

import com.dv.demo.customer.core.models.Customer;
import com.dv.demo.customer.infrastructure.gateways.repositories.sqlserver.Db_SQL;
import com.dv.demo.customer.infrastructure.gateways.repositories.sqlserver.entities.CustomerEntity;
import com.dv.demo.customer.ports.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;

@Component
public class RepositoryDAO implements IRepository {

    private Db_SQL mDbSql;

    @Autowired
    public RepositoryDAO(Db_SQL aDbSql)
    {
        mDbSql = aDbSql;
    }

    @Override
    public void store(Customer aCustomer) {
        mDbSql.save(new CustomerEntity(aCustomer));
    }

    @Override
    public Optional<Customer> fetchCustomer(String aId){
        Optional<CustomerEntity> customerEntityOpt = mDbSql.findById(aId);
        if(customerEntityOpt.isPresent())
        {
            return Optional.of(customerEntityOpt.get().toCustomer());
        }else return Optional.empty();
    }

    @Override
    public Iterable<Customer> fetchAllCustomers() {
        ArrayList<Customer> list = new ArrayList();
        Iterable<CustomerEntity> iterable = mDbSql.findAll();
        iterable.forEach(customerentity -> list.add(customerentity.toCustomer()));
        return list;
    }

}
