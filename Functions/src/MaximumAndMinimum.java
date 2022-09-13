// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Objects;
import java.util.Scanner;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i+1) + " number: " );
            int num = in.nextInt();
            arr[i] = num;
        }

        System.out.println("minimum or maximum");
        String name = in.next();

        if (Objects.equals(name, "maximum")){
            int ans = maximum(arr);
            System.out.println(ans);
        }else if(Objects.equals(name, "minimum")){
            int ans = minimum(arr);
            System.out.println(ans);
        }else {
            System.out.println("Enter valid option");
        }
    }

    static int maximum(int[] arr){
        int value = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > value){
                value = arr[i];
            }
        }
        return value;
    }

    static int minimum(int[] arr){
        int value = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (value > arr[i]){
                value = arr[i];
            }
        }
        return value;
    }
}
