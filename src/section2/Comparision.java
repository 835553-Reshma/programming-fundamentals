package section2;

import java.util.Scanner;

public class Comparision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Enter the first number");
        x = sc.nextInt();
        System.out.println("Enter the second number");
        y = sc.nextInt();
        if (x < y) {
            System.out.println(x + " is less than " + y);
        } else if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else {
            System.out.println(x + " is equal to " + y);
        }

        sc.close();

    }
}
