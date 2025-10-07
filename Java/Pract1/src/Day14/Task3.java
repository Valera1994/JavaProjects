package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    static void main() {
        System.out.println(parseFileToObjectList().toString());
    }

    public static List<Person> parseFileToObjectList(){
        File file = new File("people.txt");
        List<Person> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                int year = Integer.parseInt(person[1]);
                if(year < 0){
                    throw new IllegalArgumentException();
                }
                Person current = new Person(person[0], Integer.parseInt(person[1]));
                people.add(current);
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
