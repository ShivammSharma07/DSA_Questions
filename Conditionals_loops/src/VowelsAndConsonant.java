import java.util.Scanner;

public class VowelsAndConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char a = in.next().charAt(0);

        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
            System.out.println("vowel");
        }
        else {
            System.out.println("consonant");
        }
    }
}
