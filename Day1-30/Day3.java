import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Number Swapping====\n");

        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second NUmber: ");
        int num2 = sc.nextInt();
        System.out.println("\nBefore Swapping\n"+"Number1= "+num1+"\nNumber2= "+num2);

        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;

        System.out.println("\nAfter swapping\n"+"Number1= "+num1+"\nNumber2= "+num2);
    }
}