package section3;

import java.util.Scanner;

public class Replace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original, modified, old;
        System.out.println("Enter the content of the document");
        original = sc.nextLine();
        System.out.println("Enter the old name of the company");
        old = sc.nextLine();
        System.out.println("Enter the new name of the company");
        modified = sc.nextLine();
        original = original.replace(old, modified);

        System.out.println("The content of the modified document is\n" + original);

        sc.close();

    }

}
