package section3;

import java.util.Scanner;

public class DayWeek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number");
        int dayNumber = sc.nextInt();
        String week[] = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
        System.out.println("Day of the week is " + week[dayNumber - 1]);

        sc.close();

    }

}
