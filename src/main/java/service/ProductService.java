package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void save(Product product);
    Product findByid(int id);
    void update(int id,Product product);
    void remove(int id);

    Product findById(int id);
}
