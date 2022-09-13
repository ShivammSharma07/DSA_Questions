//Define a program to find out whether a given number is even or odd.
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = in.nextInt();

        boolean ans = check(input);

        if (ans){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }

    static boolean check(int input){
        if (input % 2 == 0){
            return true;
        }
        return false;
    }
}
