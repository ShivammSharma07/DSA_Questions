import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Principle: ");
        float Principle = in.nextInt();

        System.out.print("Enter the time: ");
        float time = in.nextInt();

        System.out.print("Enter the rate: ");
        float rate = in.nextInt();

        float converting = rate / 100;

        float finalResult = Principle * time * converting;

        System.out.println("Your SI is: " +"Rs"+finalResult);

    }
}
