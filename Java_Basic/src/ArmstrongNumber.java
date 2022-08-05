import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();

        for (int i = a; i <= b; i++){
            int temp = i;
            int check = 0;
            while (temp > 0){
                int rem = temp % 10;
                int cube = rem * rem * rem;
                check = check + cube;
                temp = temp / 10;
            }

            if (check == i){
                System.out.println(i);
            }
        }
    }
}
