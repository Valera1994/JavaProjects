package Day11;

public class Task17 {
    static void main() {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);

        System.out.println(warehouse +" "+ picker +" "+ courier);
        picker.doWork();
        courier.doWork();

        System.out.println(warehouse +" "+ picker +" "+ courier);

        for (int i = 0; i < 1498; i++){
            picker.doWork();
            courier.doWork();
        }
        picker.bonus();
        courier.bonus();
        System.out.println(warehouse +" "+ picker +" "+ courier);
    }
}
