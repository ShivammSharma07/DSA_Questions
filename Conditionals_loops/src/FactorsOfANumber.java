//Input a number and print all the factors of that number

import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                System.out.println(i);
            }
        }
    }
}
