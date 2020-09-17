package com.restapi.repository;

import com.restapi.model.Employee;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//import net.guides.springboot.crud.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long>{

}