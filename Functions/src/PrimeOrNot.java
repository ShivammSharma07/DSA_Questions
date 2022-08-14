//Define a method to find out if a number is prime or not.
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        boolean ans = primeOrNot(num);
        if (ans){
            System.out.println("Number is prime");
        }else {
            System.out.println("Number is not prime");
        }
    }

    static boolean primeOrNot(int num){
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
