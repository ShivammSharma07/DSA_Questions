import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        calc(num);
    }

    static void calc(int num){
        int a = 1;
        int b = 2;
        for (int i = 0; i <= num; i++){
            System.out.println(a);
            int temp = a+b;
            a = b;
            b = temp;
        }
    }
}
