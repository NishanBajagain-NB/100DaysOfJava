import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Even Odd chaker====");
        System.out.println("\nEnter a Number: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Number "+num+" is even");
        }else {
            System.out.println("Number "+num+" is odd");
        }
    }
}