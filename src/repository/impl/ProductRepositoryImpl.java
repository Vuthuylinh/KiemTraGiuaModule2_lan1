package repository.impl;

import model.Product;
import repository.ProductRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ProductRepositoryImpl implements ProductRepository {
    public static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "iPhone", (float) 25.0, "Yes", "Black color"));
    }

    @Override
    public List<Product> showProductList() {
        return products;
    }

    @Override
    public void add(Product product) {
        if (product != null) {
            products.add(product);
        }
    }

    @Override
    public void editProduct(int index, Product product) {
        if (index < 0 || index > products.size()) {
            System.out.println("Chi so khong ton tai");
        } else {
            products.set(index, product);
        }

    }

    @Override
    public  void removeProduct(int index){
        if (index < 0 || index > products.size()) {
            System.out.println("Chi so khong ton tai");
        } else {
            products.remove(index);
        }
    }
    @Override
    public String findByName(String name){
        for(Product product:products){
            String productName=product.getName();
            if(name.equals(productName)){
               return product.toString();
            }
        }
        return "Don't have this product";
    }

    @Override
    public ArrayList<Product> sortUpward(){
        Collections.sort(products, new Comparator<Product>(){
            public int compare(Product o1, Product o2){
                if (o1.getPrice()>o2.getPrice()){
                    return 1;
                } else if (o1.getPrice()==o2.getPrice()){
                    return 0;
                } else return -1;
            }
        });
        return products;
    }

    @Override
    public ArrayList<Product> sortDownward() {
        Collections.sort(products, new Comparator<Product>(){
            public int compare(Product p1, Product p2){
                if (p1.getPrice()< p2.getPrice()){
                    return 1;
                } else if (p1.getPrice()==p2.getPrice()){
                    return 0;
                } else return -1;
            }
        });
        return products;
    }
}