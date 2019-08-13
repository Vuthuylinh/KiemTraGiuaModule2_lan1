package view;

import controller.ProductController;
import model.Product;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ProductController productController = new ProductController();
        int choice;
        do { showChoice();
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    List<Product> productList = productController.showProductList();
                    for (Product product : productList) {
                        System.out.println(product.toString());
                    }
                    break;
                case 2:
                    System.out.println("Add product: ");
                    Product product1 = createProduct();
                    productController.add(product1);
                    break;
                case 3:
                    System.out.println("Enter index for editing: ");
                    int indexEdit = input.nextInt();
                    productController.editProduct(indexEdit, createProduct());
                    break;
                case 4:
                    System.out.println("Enter index for removing:");
                    int indexRemove = input.nextInt();
                    productController.removeProduct(indexRemove);
                    break;
                case 5:
                    System.out.println("Enter a product's name:  ");
                    String name= input.nextLine();
                    System.out.println(productController.findByName(name));
                    break;
                case 6:
                    System.out.println("Arrange product list upPrice");
                    productController.sortUpward();
                    break;
                case 7:
                    System.out.println(" Arrange product list downPrice:");
                    productController.sortDownward();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("You didn't make any choice");

            }
        } while (choice != 0);


    }

    public static void showChoice() {
        System.out.println("1. Show all products");
        System.out.println("2. Add a new product");
        System.out.println("3. Edit a product");
        System.out.println("4. Remove a product");
        System.out.println("5. Find a product by name");
        System.out.println("6. Arrange product list upPrice");
        System.out.println("7. Arange product list downPrice");
        System.out.println("0. Exit");
    }


    public static Product createProduct() {
        System.out.println("Nhap ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Nhap NAME: ");
        String name = input.nextLine();
        System.out.println("Enter price: ");
        float price = input.nextFloat();
        input.nextLine();
        System.out.println("Enter status: ");
        String status = input.nextLine();
        System.out.println("Enter description: ");
        String description = input.nextLine();

        Product product = new Product(id, name, price, status, description);

        return product;
    }
}
