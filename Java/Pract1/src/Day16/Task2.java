package Day16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    static void main() throws IOException {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        Scanner scanner1 = new Scanner(file1);
        Scanner scanner2 = new Scanner(file2);

        PrintWriter pw1 = new PrintWriter(file1);
        PrintWriter pw2 = new PrintWriter(file2);

        Random random = new Random();
        for(int i =0; i < 1000; i++){
            pw1.println(random.nextInt(100));
        }
        pw1.close();


        while (scanner1.hasNextLine()){
            double sum = 0;
            int count = 0;
            for(int i = 0; i < 20; i++){
                sum += Integer.parseInt(scanner1.nextLine());
                count++;
            }
            pw2.println(sum/count);
        }
        pw2.close();

        double sum = 0;
        while (scanner2.hasNextLine()){
            sum += Double.parseDouble(scanner2.nextLine());
        }
        System.out.println((int)sum);
        scanner1.close();
        scanner2.close();
    }
}
