package service;

import java.util.ArrayList;
import java.util.List;

public interface GeneralService<E> {
    List<E> showProductList();
    void add(E e);
    void editProduct(int index, E e);
    void removeProduct(int index);
    String findByName(String name);
    ArrayList<E> sortUpward();
    ArrayList<E> sortDownward();
}
