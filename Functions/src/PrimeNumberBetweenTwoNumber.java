// Write a function that returns all prime numbers between two given numbers.
import java.util.Scanner;

public class PrimeNumberBetweenTwoNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        primeNumber(num1, num2);
    }

    static void primeNumber(int num1, int num2){
        int temp = 0;
        for (int i = num1; i <= num2; i++){
            for (int j = 2; j < i ; j++){
                if (i % j == 0){
                    temp++;
                }
            }
            if (temp == 0){
                System.out.println(i);
            }else {
                temp = 0;
            }
        }
    }
}
