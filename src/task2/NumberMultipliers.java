package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberMultipliers {

    public static void findNumberMultipliers() {

        int multiplier = 2;
        int number = 0;
        System.out.print("Enter some number: ");
        while (true) {

            try {
                Scanner scan = new Scanner(System.in);
                number = scan.nextInt();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Entered value is not an integer!");
            }

        }

        System.out.print("You number:" + number + " = ");

        while (true) {

            if (number == multiplier) {
                System.out.print(multiplier);
                break;
            }
            if (number % multiplier == 0) {
                System.out.print(multiplier + "*");
                number = number / multiplier;
            } else {
                ++multiplier;
            }
        }
    }
}
