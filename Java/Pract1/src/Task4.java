import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.println();
            System.out.print("Enter the number 1: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the number 2: ");
            double num2 = scanner.nextDouble();
            if(num2 == 0){
                System.out.print("Деление на 0!");
                continue;
            }
            System.out.print("Result: " + (num1/num2));
        }
    }
}
