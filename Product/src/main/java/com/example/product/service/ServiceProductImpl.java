package com.example.product.service;

import com.example.product.model.product;
import com.example.product.repo.ProductRepo;
import com.example.product.repo.ProductRepoImpl;

import java.util.List;

public class ServiceProductImpl implements ServiceProduct{
        ProductRepo productRepo = new ProductRepoImpl();
    @Override
    public List<product> displayAll() {
        return productRepo.displayAll();
    }

    @Override
    public void addNew(product product) {
        productRepo.addNew(product);
    }

    @Override
    public void update(int id, product product) {
        productRepo.update(id,product);
    }

    @Override
    public void remove(int id) {
        productRepo.remove(id);
    }

    @Override
    public product displayDescrise(int id) {
        return productRepo.displayDescrise(id);
    }

    @Override
    public List<product> searchByName(String name) {
        return productRepo.searchByName(name);
    }
}
