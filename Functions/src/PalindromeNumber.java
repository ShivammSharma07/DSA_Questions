// Write a function to find if a number is a palindrome or not. Take number as parameter.
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int num = in.nextInt();

        boolean ans = checkingTheNumber(num);

        if (ans){
            System.out.println("Number is palindrome");
        }else {
            System.out.println("Number is not palindrome");
        }
    }
    static boolean checkingTheNumber(int num){
        int numcopy = num;
        int value = 0;
        while (numcopy > 0){
            int rem = numcopy % 10;
            value = value * 10 + rem;
            numcopy = numcopy / 10;
        }

        return num == value;
    }

}
