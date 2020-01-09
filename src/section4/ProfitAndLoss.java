package section4;

import java.util.Scanner;

public class ProfitAndLoss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        System.out.println("Enter the number of dozens of toys purchased ");
        x = sc.nextInt();
        System.out.println("Enter the price per dozen ");
        y = sc.nextInt();
        System.out.println("Enter the selling price of 1 toy ");
        z = sc.nextInt();
        ProfitAndLoss profitLoss = new ProfitAndLoss();
        float profitPer = profitLoss.calculateProfit(x, y, z);
        System.out.printf("Sam's profit percentage is %.2f percentage", profitPer);
        sc.close();
    }

    public float calculateProfit(int dozenCount, int pricePerDozen, int sellPrice) {
        float costPrice = (float) pricePerDozen / 12;
        float profit = (float) sellPrice - costPrice;
        float profitPercentage = (profit / costPrice) * 100;
        return profitPercentage;
    }

}
