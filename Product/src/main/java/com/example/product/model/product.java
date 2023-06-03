package com.example.product.model;

public class product {
    private int id;
    private String name;
    private String price;
    private String descrise;
    private String NSX;

    public product(int id, String name, String price, String descrise, String NSX) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.descrise = descrise;
        this.NSX = NSX;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescrise() {
        return descrise;
    }

    public void setDescrise(String descrise) {
        this.descrise = descrise;
    }

    public String getNSX() {
        return NSX;
    }

    public void setNSX(String NSX) {
        this.NSX = NSX;
    }

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", descrise='" + descrise + '\'' +
                ", NSX='" + NSX + '\'' +
                '}';
    }
}
