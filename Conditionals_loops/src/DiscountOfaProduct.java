//Calculate Discount Of Product

import java.util.Scanner;

public class DiscountOfaProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double mul = 25/100;
        System.out.println(mul);
        System.out.print("Enter the price of an item: ");
        int price = in.nextInt();
        System.out.print("Enter the % of the discount: ");
        int disc = in.nextInt();

        //converting % to decimal
        double decDisc = (disc / 100.0);

        // Multiplying original price with decimal
        double newPrice = price * decDisc;

        // Subtracting discount price from original price
        double finalAns = price - newPrice;

        System.out.println("You discounted price is " + finalAns);
    }
}
