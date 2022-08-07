// LCM of two numbers

import java.util.Scanner;

public class LCM_OfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int numOne = in.nextInt();
        System.out.print("Enter the second number: ");
        int numTwo = in.nextInt();

        int newNum = 1;
        if (numOne > numTwo){
             newNum = numOne;
        }else {
             newNum = numTwo;
        }

        boolean con = true;
        while (con){
            if (newNum % numOne == 0 && newNum % numTwo == 0){
                con = false;
                break;
            }else {
                newNum++;
            }
        }
        System.out.println(newNum);
    }
}
