package QuanLySanPham;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {

    private int id;
    private String name;
    private String produce;
    private double price;
    private String description;

    public Product() {
    }

    public Product(int id, String name, String produce, double price, String description) {
        this.id = id;
        this.name = name;
        this.produce = produce;
        this.price = price;
        this.description = description;
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

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", produce='" + produce + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
    public void display() {
        System.out.println(toString());
    }

}