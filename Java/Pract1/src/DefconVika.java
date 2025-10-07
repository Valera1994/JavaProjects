import java.util.Scanner;

public class DefconVika {
    public static void main(String[] args) {
        Material material1 = new Material("steel", 7850);
        Thing thing1 = new Thing("wire", material1, 0.03);
        thing1.show();

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите объем: ");
        double newValue = scanner.nextDouble();
        Material material2 = new Material("cooper", 8500);
        Thing thing2 = new Thing("wire", material2, newValue);
        thing2.show();
    }
}
