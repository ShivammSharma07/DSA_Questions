//Calculate Electricity Bill

import java.util.Scanner;

public class CalculateElectricBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the unit: ");
        int unit = in.nextInt();
        int fixedCharge = 40;
        int energyDuty = (int) (unit * 0.15);
        int totalCharge = fixedCharge + energyDuty;

        if (unit <= 100){
            float result = (float) ((unit * 4.22) + totalCharge);
            System.out.println("Your total bill is " + result + " Rs");
        } else if (unit <= 200) {
            float result = (float) ((100 * 4.22) + ((unit - 100) * 5.02) + totalCharge);
            System.out.println("Your total bill is " + result + " Rs");
        }else {
            float result = (float) ((100 * 4.22) + (100 * 5.03) + ((unit - 200) * 5.87) + totalCharge);
            System.out.println("Your total bill is " + result + " Rs");
        }
    }
}
