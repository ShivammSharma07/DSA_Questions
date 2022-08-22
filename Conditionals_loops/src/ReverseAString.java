//Reverse A String In Java
import java.util.Scanner;

//Reverse A String In Java
public class ReverseAString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = in.nextLine();

        String reverse = "";
        for (int i = name.length()-1; i >= 0; i-- ){
            reverse += name.charAt(i);
        }
        System.out.println(reverse);
    }
}
