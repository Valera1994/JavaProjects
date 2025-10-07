package Day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    static void main() {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 350; i+=2){
            if(i <= 30 || i >=300 ){
                list.add(i);
            }
        }
        System.out.println(list);

    }
}
