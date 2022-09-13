//Write a program to print the factorial of a number by defining a method named 'Factorial'.

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();

        int ans = factorial(num);
        System.out.println(ans);
    }

    static int factorial(int num){
        int value = 1;
        for (int i = num; i > 0; i--){
            value = value * i;
        }
        return value;
    }
}
