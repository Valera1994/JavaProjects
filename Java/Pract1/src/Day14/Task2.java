package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    static void main() {
        System.out.println(parseFileToString());
    }

    public static List<String> parseFileToString(){
        File file = new File("people.txt");
        List<String> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                int year = Integer.parseInt(person[1]);
                if(year < 0){
                    throw new IllegalArgumentException();
                }
                people.add(line);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
