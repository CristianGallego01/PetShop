package com.petShop.persistance;

import com.petShop.persistance.crud.ProductCrudRepository;
import com.petShop.persistance.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll(){
        return (List<Product>) productCrudRepository.findAll();
    }

    public Optional<Product> getProductById(int id_product) {
        return productCrudRepository.findById(id_product);
    }

    public Product save(Product product) {
        return productCrudRepository.save(product);
    }

    public void delete(int id_product) {
        productCrudRepository.deleteById(id_product);
    }
    public boolean existsProduct(int id_product){
        return productCrudRepository.existsById(id_product);
    }

    public long countAll(){
        return productCrudRepository.count();
    }
}
