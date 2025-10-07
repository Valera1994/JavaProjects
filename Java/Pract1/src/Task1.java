import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Result: ");
        /*for(int i = num1; i <= num2; i++){*/
        while ( num1 <= num2){
            if((num1 % 5 == 0) && (num1 % 10 != 0)){
                System.out.print(" " + num1);
            }
            num1++;
        }
    }
}
