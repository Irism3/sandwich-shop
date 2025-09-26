import java.util.Arrays;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the sandwich shop!,What size would you like?:");
        System.out.println("1: Regular ($5.45)");
        System.out.print("2:Large ($8.95):");
        int sizeChoice = scanner.nextInt();

        Double price = 0.0;
        if (sizeChoice == 1 ){
            price = 5.46;
        }else if (sizeChoice == 2){
            price = 8.95;
        }else{
            System.out.println("invalid choice.");
            return;
        }
        //step 2. users age
        System.out.print("Enter your age:");
        int age = scanner.nextInt();

        //applying discount
        if (age <= 17){
            price = price * 0.90; //10% discount
        }else if (age >= 65) {
            price = price * 0.80; //20% discount
        }

        System.out.printf("Your total is: $%.2f%n", price);












    }
}
