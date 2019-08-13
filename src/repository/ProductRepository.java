package repository;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public interface ProductRepository extends GeneralRepository<Product> {

    @Override
    List showProductList();

    @Override
    void add(Product product);

    @Override
    void editProduct(int index, Product product);

    @Override
    void removeProduct(int index);

    @Override
    String findByName(String name);

    @Override
    ArrayList<Product> sortUpward();
    ArrayList<Product> sortDownward();
}
