package service.impl;

import model.Product;
import repository.impl.ProductRepositoryImpl;
import service.ProductService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductServiceImpl implements ProductService {
ProductRepositoryImpl productRepository = new ProductRepositoryImpl();
    @Override
    public List showProductList(){
        return productRepository.showProductList();
    }
    @Override
    public void add(Product product){
        productRepository.add(product);
    }

    @Override
    public void editProduct(int index, Product product) {
    productRepository.editProduct(index,product);
    }

    @Override
    public void removeProduct(int index){
        productRepository.removeProduct(index);
    }

    @Override
    public  String findByName(String name){
        return productRepository.findByName(name);
    }
    @Override
    public ArrayList<Product> sortUpward(){

        return productRepository.sortUpward();
    }

    @Override
    public  ArrayList<Product> sortDownward(){
        return productRepository.sortDownward();
    }

}
