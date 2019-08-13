package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public interface ProductService extends GeneralService<Product> {
    @Override
    public List<Product> showProductList();

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

    @Override
    ArrayList<Product> sortDownward();

}
