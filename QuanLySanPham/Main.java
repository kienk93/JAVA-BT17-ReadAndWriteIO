package QuanLySanPham;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int choice;
        ProductManager productManager = new ProductManager();
        productManager.init();
        do {
            showMenu();
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    //Thêm sản phẩm
                    productManager.addProduct();
                    break;
                case 2:
                    //Hiển thị sản phẩm
                    productManager.showProduct();
                    break;
                case 3:
                    //Tìm kiếm sản phẩm theo id
                    productManager.getProductByID();
                    break;
                case 4:
                    //Sắp xếp sản phẩm theo bé => lớn
                    productManager.sortProductAZ();
                    break;
                case 5:
                    //Sắp xếp sản phẩm theo lớn => bé
                    productManager.sortProductZA();
                    break;
                case 6:
                    //Ghi file ra txt
                    productManager.writeToFile("product.txt", productManager.products);
                    break;
                case 7:
                    //Đọc file txt
                    productManager.readFile();
                    productManager.displayReadFile();
                    break;
                case 8:
                    System.out.println("Thoát khỏi chương trình");
                    break;
            }
        } while (choice != 8);
    }
    public static void showMenu() {
        System.out.println("Chương trình quản lý sản phẩm");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Hiển thị sản phẩm");
        System.out.println("3. Tìm kiếm sản phẩm theo id");
        System.out.println("4. Sắp xếp sản phẩm theo bé => lớn");
        System.out.println("5. Sắp xếp sản phẩm theo lớn => bé");
        System.out.println("6. Ghi file ra txt");
        System.out.println("7. Đọc file txt");
        System.out.println("8. Thoát khỏi chương trình");
        System.out.println("Vui lòng lựa chọn");
    }


}