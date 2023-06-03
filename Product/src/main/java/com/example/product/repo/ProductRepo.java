package com.example.product.repo;

import com.example.product.model.product;

import java.util.List;

public interface ProductRepo {
    List<product> displayAll();
    void addNew(product product);
    void update(int id,product product);
    void remove(int id);
    product displayDescrise(int id);
    List<product> searchByName(String name);
}
