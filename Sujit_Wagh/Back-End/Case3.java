package Case;

import java.util.Scanner;

public class Case3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for Bike || 2 for Car");
        int choice = sc.nextInt();

        System.out.println("Enter Like Choice");
        int like = sc.nextInt();

        switch (choice) {

        case 1:
            switch (like) {
            case 1:
                System.out.println("Hero");
                break;

            case 2:
                System.out.println("Honda");
                break;

            case 3:
                System.out.println("Bullet");
                break;

            default:
                System.out.println("Choose correct bike input");
            }
            break;

        case 2:
            switch (like) {
            case 1:
                System.out.println("Kia");
                break;

            case 2:
                System.out.println("Mercedes");
                break;

            case 3:
                System.out.println("Audi");
                break;

            default:
                System.out.println("Choose correct car input");
            }
            break;

        default:
            System.out.println("Please insert correct input");
        }

    }

}