import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(0,10000);
        }
        int more = arr[0];
        int less = arr[0];
        int count = 0;
        int sum = 0;

        for (int num : arr){
            if (num > more){
                more = num;
            }
            if (num < less){
                less = num;
            }
            if (num % 10 == 0){
                sum += num;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(more);
        System.out.println(less);
        System.out.println(sum);
        System.out.println(count);
    }
}
