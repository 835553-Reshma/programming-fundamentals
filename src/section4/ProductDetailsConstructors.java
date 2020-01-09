package section4;

import java.util.Scanner;

public class ProductDetailsConstructors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product1 p = new Product1();
        System.out.println("Enter the product id ");
        long id = sc.nextLong();
        p.setId(id);
        sc.nextLine();
        System.out.println("Enter the product name ");
        String productName = sc.nextLine();
        p.setProductName(productName);
        System.out.println("Enter the supplier name ");
        String supplierName = sc.nextLine();
        p.setSupplierName(supplierName);
        Product1 p1 = new Product1(id, productName, supplierName);
        p1.display();
        sc.close();

    }

}
