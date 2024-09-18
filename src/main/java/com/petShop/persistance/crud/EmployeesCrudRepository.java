package com.petShop.persistance.crud;

import com.petShop.persistance.entity.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeesCrudRepository extends CrudRepository<Employees,Integer> {
}
