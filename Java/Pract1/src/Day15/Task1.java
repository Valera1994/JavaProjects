package Day15;

import Task16.Figure;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    static void main() {
        File file = new File("input.cvs");
        File fileOutput = new File("output.cvs");
        try {
            Scanner scanner = new Scanner(file);
            PrintWriter pw = new PrintWriter(fileOutput);

            while (scanner.hasNextLine()){
                String[] line = scanner.nextLine().split(";");
                if (Integer.parseInt(line[2]) == 0){
                    pw.println(line[0] + ", " + line[1] + ", " + line[2]);
                }
            }
            pw.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
