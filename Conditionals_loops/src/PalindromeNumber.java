// Find if a number is palindrome or not

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int chekNum = check(num);

        if (num == chekNum){
            System.out.println("Number is palindrome");
        }else {
            System.out.println("Number is not palindrome");
        }
    }

    static int check(int num){
        int newNum = 0;
        while (num > 0){
            int rem = num % 10;
            newNum = newNum * 10 + rem;
            num = num / 10;
        }
        return newNum;
    }
}
