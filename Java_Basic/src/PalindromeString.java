import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String name = in.nextLine();
        boolean ans = check(name);
        System.out.println(ans);
    }

    static boolean check(String name){
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--){
            rev += name.charAt(i);
        }
        if (rev.equals(name)){
            return true;
        }
        return false;
    }
}
