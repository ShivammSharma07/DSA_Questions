import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of Rupees: ");
        int rupees = in.nextInt();

        double calculation = rupees * 0.0127170647;
        System.out.println(rupees + " Indian rupees is equal to " + calculation + " USD");

    }
}
