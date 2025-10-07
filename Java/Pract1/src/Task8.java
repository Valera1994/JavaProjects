import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Random random = new Random();

        int[]arr = new int[100];
        int maxSum = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(0,10000);
        }
        for(int i = 0; i < arr.length - 2; i++){
            int sum = 0;
            for(int j = i; j < i + 3; j++){
                sum += arr[j];
            }
            System.out.println(i + " " + sum);
            if (maxSum <= sum){
                maxSum = sum;
                index = i;
            }
        }
        System.out.println(index);
        System.out.println(Arrays.toString(arr));
    }
}
