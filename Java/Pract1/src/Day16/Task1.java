package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    static void main() throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);

        int sum = 0;
        int count = 0;
        double average = 0;
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            sum += num;
            count++;
        }
        average = (double) sum/count;
        System.out.printf("%d, %d, %f, %.3f", sum, count, average, average);
    }
}
