import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = Math.sin(Math.pow(num1, 2));
        System.out.println(num2);
    }
}
