package com.dv.demo.customer.infrastructure.gateways.repositories.sqlserver;

import com.dv.demo.customer.infrastructure.gateways.repositories.sqlserver.entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Db_SQL extends CrudRepository<CustomerEntity, String> {
}
