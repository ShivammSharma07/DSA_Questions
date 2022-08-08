//Find the number of permutations if n = 12 and r = 2.
// nPr = (n!) / (n-r)!
public class Permutation {
    public static void main(String[] args) {
        int n = 12;
        int r = 2;

        int nFactorial = 1;
        for (int i = n; i > 0; i--){
            nFactorial *= i;
        }

        int denominator = n - r;

        int denominatorFactorial = 1;
        for (int i = denominator; i > 0; i--){
            denominatorFactorial *= i;
        }

        int ans = nFactorial / denominatorFactorial;
        System.out.println(ans);
    }
}
