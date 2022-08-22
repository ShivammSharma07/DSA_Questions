//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.ArrayList;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        int num = 1;
        while (num != 0){
            System.out.print("Enter a number: ");
            int inp = in.nextInt();
            list.add(inp);
            num = inp;
        }

        int greater = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) > greater){
                greater = list.get(i);
            }
        }
        System.out.println(greater);
    }
}
