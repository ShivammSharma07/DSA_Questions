//HCF of two numbers

import java.util.Scanner;

public class HCF_OfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int numOne = in.nextInt();
        System.out.print("Enter second number: ");
        int numTwo = in.nextInt();

        int hcf = 0;
        for (int i = 1; i <= numOne && i <= numTwo; i++){
            if (numOne % i == 0 && numTwo % i == 0){
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
}
