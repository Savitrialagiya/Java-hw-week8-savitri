package week8hw;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 */
public class Program2_MinAndMaxInputChallenge {

    public static void main(String[] args) {

        Program2_MinAndMaxInputChallenge t = new Program2_MinAndMaxInputChallenge();
        t.minAndMaxInput();
    }

    public void minAndMaxInput() {
        Scanner scanner = new Scanner(System.in);
        int number1, number2, max , min ;
        System.out.println("Enter number: ");
        number1 = scanner.nextInt();
        System.out.println("Enter another number: ");
        number2 = scanner.nextInt();
        max = Math.max(number1,number2);
        min = Math.min(number1,number2);

        while (number2 != -99) {
            //System.out.println("Enter a number or -99 to stop: ");
           // number2 = scanner.nextInt();
            if (number2 != -99) {
                max = Math.max(max,number2);
                min = Math.min(min,number2);
                break;
            }
        }
        System.out.println("the Maximum is : " + max);
        System.out.println("the Minimum is : " + min);
        scanner.close();
    }
}
