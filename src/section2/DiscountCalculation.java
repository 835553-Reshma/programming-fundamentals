package section2;

import java.util.Scanner;

public class DiscountCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float item1, item2, item, amount, saved;
        System.out.println("Price of item 1 : ");
        item1 = sc.nextFloat();
        System.out.println("Price of item 2 : ");
        item2 = sc.nextFloat();
        System.out.println("Discount in percentage : ");
        int d = sc.nextInt();
        item = (item1 + item2);
        System.out.printf("\nTotal amount : $%.2f", item);
        float s = 100 - d;
        amount = (s * item) / 100;
        System.out.printf("\nDiscounted amount : $%.2f", amount);
        saved = item - amount;
        System.out.printf("\nSaved amount : $%.2f", saved);

        sc.close();

    }

}
