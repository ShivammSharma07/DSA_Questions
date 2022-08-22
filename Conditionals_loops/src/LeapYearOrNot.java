//Check Leap Year Or Not

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int year = in.nextInt();

        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("Leap year");
        }
        else if(year % 400 == 0){
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}
