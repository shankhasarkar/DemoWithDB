package com.dv.demo.customer.infrastructure.configs;

import com.dv.demo.customer.core.models.Customer;
import com.dv.demo.customer.infrastructure.gateways.repositories.sqlserver.Db_SQL;
import com.dv.demo.customer.infrastructure.gateways.repositories.sqlserver.entities.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class DB_Init {

    @Autowired
    public DB_Init(Db_SQL aDb)
    {
        aDb.deleteAll();

//        aDb.save(new CustomerEntity(new Customer("Scott", "Parker", "WFA-100", Date.valueOf("1980-06-01"))));
//        aDb.save(new CustomerEntity(new Customer("John", "Page", "WFA-101", Date.valueOf("1980-09-01"))));
//        aDb.save(new CustomerEntity(new Customer("Randy", "Hall", "WFA-102", Date.valueOf("1980-7-01"))));
    }
}
