package QuanLySanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class ProductManager {
    Scanner input = new Scanner(System.in);
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct() {
        System.out.println("nhập số lượng Product muốn thêm");
        int num = input.nextInt();
        input.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("nhap id ");
            int id = Integer.parseInt(input.nextLine());
            System.out.println("nhap name ");
            String name = input.nextLine();
            System.out.println("nhap nha san xuat ");
            String produce = input.nextLine();
            System.out.println("nhap gia ");
            int price = Integer.parseInt(input.nextLine());
            System.out.println("nhap mieu ta ");
            String description = input.nextLine();
            products.add(new Product(id, name, produce, price, description));
        }

    }

    public void init() {

        products.add(new Product(1, "banana", "KienFruit", 1000, "chuối"));
        products.add(new Product(3, "grape", "KienFruit", 5000, "nho"));
        products.add(new Product(2, "socola", "KienFruit", 10000, "socola"));

    }

    public void showProduct() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public void getProductByID() {

        System.out.println("nhập id product muốn tìm ");
        int id = Integer.parseInt(input.nextLine());
        boolean isExist = false;
        for (Product product : products) {
            if (product.getId() == id) {
                isExist = true;
                System.out.println(product.toString());
            }
        }
        if (!isExist) {
            System.out.println("không thấy id trùng để hiện SP");
        }
        System.out.println("------------------------------------");

    }

    public void sortProductAZ() {
        for (int i = 0; i < products.size(); i++) {
            int index = i;
            Product temp = products.get(i);
            while (index > 0 && temp.getId() < products.get(index - 1).getId()) {
                products.set(index, products.get(index - 1));
                index--;
            }
            products.set(index, temp);
        }

    }

    public void sortProductZA() {
        for (int i = 0; i < products.size(); i++) {
            int index = i;
            Product temp = products.get(i);
            while (index > 0 && temp.getId() > products.get(index - 1).getId()) {
                products.set(index, products.get(index - 1));
                index--;
            }
            products.set(index, temp);
        }

    }

    public void writeToFile(String path, ArrayList<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            fos.close();
            oos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public ArrayList<Product> readFile() {
        try {
            FileInputStream fis = new FileInputStream("product.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (ArrayList<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }

    public void displayReadFile() {
        for (Product e : products) {
            System.out.println(e);
        }
    }


}