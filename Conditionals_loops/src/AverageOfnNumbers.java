public class AverageOfnNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int num = arr.length;
        int add = 0;
        for (int i = 0; i < arr.length; i++){
            add += arr[i];
        }
        int averageofnum = add / num;
        System.out.println(averageofnum);
    }
}
