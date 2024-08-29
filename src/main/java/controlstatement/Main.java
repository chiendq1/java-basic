package controlstatement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you wish to enter: ");
        System.out.println("0. Exit");
        System.out.println("1. If else control statement");
        int n = sc.nextInt();

        switch (n) {
            case 0:
                System.out.println("Goodbye");
                System.exit(0);
                break;
            case 1:
                System.out.println("Enter a number from 1 to 10:");
                int number = sc.nextInt();
                sc.nextLine();
                if(number >= 1 && number <= 5) {
                    System.out.println("You entered less than or equal 5");
                } else {
                    System.out.println("You entered greater than 5");
                }
        }
    }
}
