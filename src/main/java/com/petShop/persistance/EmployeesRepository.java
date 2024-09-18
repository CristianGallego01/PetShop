package com.petShop.persistance;

import com.petShop.persistance.crud.EmployeesCrudRepository;

import com.petShop.persistance.entity.Employees;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmployeesRepository {
    private EmployeesCrudRepository employeesCrudRepository;

    public List<Employees> getAll(){
        return (List<Employees>) employeesCrudRepository.findAll();
    }

    public Optional<Employees> getEmployeesById(int id_employee) {
        return employeesCrudRepository.findById(id_employee);
    }

    public Employees save(Employees employees) {
        return employeesCrudRepository.save(employees);
    }

    public void delete(int id) {
        employeesCrudRepository.deleteById(id);
    }
    public boolean existsEmployees(int id_employee){
        return employeesCrudRepository.existsById(id_employee);
    }

    public long countAll(){
        return employeesCrudRepository.count();
    }
}
