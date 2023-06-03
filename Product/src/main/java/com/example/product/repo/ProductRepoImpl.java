package com.example.product.repo;

import com.example.product.model.product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepoImpl implements ProductRepo{
    static List<product> productList = new ArrayList<>();
    static {
       productList.add(new product(1,"Iphone","10000$","XSMax","Apple"));
       productList.add(new product(2,"Samsung","3000$","S23Ultra","NamSung"));
       productList.add(new product(3,"Xiaomi","1000$","RedMi8Plus","Xiaomi"));
       productList.add(new product(4,"Sony","500$","XperiaV1","Sony"));
       productList.add(new product(5,"Oppo","300$","Reno8T","Oppo"));
    }
    @Override
    public List<product> displayAll() {
        return productList;
    }

    @Override
    public void addNew(product product) {
        productList.add(product);
    }

    @Override
    public void update(int id, product product) {
        for (int i = 0; i <productList.size() ; i++) {
            if(productList.get(i).getId()==id){
                productList.get(i).setName(product.getName());
                productList.get(i).setPrice(product.getPrice());
                productList.get(i).setDescrise(product.getDescrise());
                productList.get(i).setNSX(product.getNSX());
            }
        }

    }

    @Override
    public void remove(int id) {
        int i;
        for ( i = 0; i <productList.size() ; i++) {
            if(productList.get(i).getId() == id){
                break;
            }
        }
        productList.remove(i);
    }

    @Override
    public product displayDescrise(int id) {
        for (product product:
             productList) {
            if(productList.get(id).getId() == product.getId()){
                return product;
            }
        }
        return null;
    }

    @Override
    public List<product> searchByName(String name) {
        List<product> list2 = new ArrayList<>();
       for(product in : productList){
           if(in.getName().contains(name)){
               list2.add(in);
           }
       }
        return list2;
    }

}
