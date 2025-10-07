package Day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    static void main() {
        List<String> list = new ArrayList<>();

        list.add("Audi");
        list.add("Porsche");
        list.add("Nissan");
        list.add("Hyundai");
        list.add("Toyota");

        System.out.println(list);

        list.add(2, "BMW");
        System.out.println(list);

        list.remove(0);

        System.out.println(list);
    }
}
