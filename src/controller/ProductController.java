package controller;

import model.Product;
import service.impl.ProductServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    ProductServiceImpl productService = new ProductServiceImpl();
    public List<Product> showProductList(){
        return productService.showProductList();
    }

    public void add(Product product){
        productService.add(product);
    }

    public  void editProduct(int index, Product product){
        productService.editProduct(index,product);
    }

    public void removeProduct(int index){
        productService.removeProduct(index);

    }

    public String findByName(String name){
        return productService.findByName(name);
    }

    public ArrayList<Product> sortUpward(){
        return productService.sortUpward();
    }
    public ArrayList<Product> sortDownward(){
        return productService.sortDownward();
    }
}
