//Find the number of combinations if n = 12 and r = 2.
// combination = n! / r!(n-r)!
public class Combination {
    public static void main(String[] args) {
        int n = 12;
        int r = 2;

        int nFactorial = 1;
        for (int i = n; i > 0; i--){
            nFactorial *= i;
        }

        int rFactorial = 1;
        for (int i = r; i > 0; i--){
            rFactorial *= i;
        }

        int denominator = n - r;

        int denominatorFactorial = 1;
        for (int i = denominator; i > 0; i--){
            denominatorFactorial *= i;
        }

        int ans = nFactorial / (rFactorial * denominatorFactorial);
        System.out.println(ans);
    }
}
