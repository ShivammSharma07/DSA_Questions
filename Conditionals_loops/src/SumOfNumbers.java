// Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        int usr = 1;
        while (usr != 0){
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            list.add(num);
            usr = num;
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }

        System.out.println(sum);
    }
}
