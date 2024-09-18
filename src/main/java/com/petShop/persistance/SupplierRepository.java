package com.petShop.persistance;

import com.petShop.persistance.crud.SupplierCrudRepository;
import com.petShop.persistance.entity.Supplier;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SupplierRepository {
    private SupplierCrudRepository supplierCrudRepository;

    public List<Supplier> getAll(){
        return (List<Supplier>) supplierCrudRepository.findAll();
    }

    public Optional<Supplier> getSupplierById(int id_product) {
        return supplierCrudRepository.findById(id_product);
    }

    public Supplier save(Supplier supplier) {
        return supplierCrudRepository.save(supplier);
    }

    public void delete(int id_product) {
        supplierCrudRepository.deleteById(id_product);
    }
    public boolean existsSupplier(int idSupplier){
        return supplierCrudRepository.existsById(idSupplier);
    }

    public long countAll(){
        return supplierCrudRepository.count();
    }
}
