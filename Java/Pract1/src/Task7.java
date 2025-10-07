import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();

        int max = 0;

        int[][] arr = new int[12][8];
        int maxSum = 0;
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = random.nextInt(0, 50);
                sum += arr[i][j];
            }
            System.out.println(sum);
            if (maxSum <= sum){
                maxSum = sum;
                index = i;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(index);

    }
}
