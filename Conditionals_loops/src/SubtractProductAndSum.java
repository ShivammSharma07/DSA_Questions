// Subtract the Product and Sum of Digits of an Integer

public class SubtractProductAndSum {
    public static void main(String[] args) {
        int num = 234;
        int add = addingnum(num);
        int mul = mulnum(num);
        int ans = mul - add;
        System.out.println(ans);
    }

    static int addingnum(int num){
        int temp = 0;
        while (num > 0){
            int rem = num % 10;
            temp += rem;
            num /= 10;
        }
        return temp;
    }

    static int mulnum(int num){
        int temp = 1;
        while (num > 0){
            int rem = num % 10;
            temp *= rem;
            num /= 10;
        }
        return temp;
    }
}
