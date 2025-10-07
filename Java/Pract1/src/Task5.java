import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int[] arr = new int[elements];
        Random random = new Random();

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int sum = 0;

        for(int num = 0; num < arr.length; num++){
            arr[num] = random.nextInt(10);
            if (arr[num] > 8){
                count1++;
            }
            if (arr[num] == 1){
                count2++;
            }
            if ( arr[num] % 2 == 0){
                count3++;
            }else{
                count4++;
            }
            sum += arr[num];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.printf("Arr length: %d", arr.length);
        System.out.println();
        System.out.printf("Count numbers more 8: %d", count1);
        System.out.println();
        System.out.printf("Count numbers equals 1: %d", count2);
        System.out.println();
        System.out.printf("Count numbers is even: %d", count3);
        System.out.println();
        System.out.printf("Count numbers is not even: %d", count4);
        System.out.println();
        System.out.printf("Sum numbers: %d", sum);
    }
}
