package week8hw;
/**Write a program to input any number and check if it Armstrong number or not
 153 = (1*1*1)+(5*5*5)+(3*3*3)
 where:
 (1*1*1)=1
 (5*5*5)=125
 (3*3*3)=27
 So:
 1+125+27=153
 */

import java.util.Scanner;

public class Program10_ArmstrongNumber {

    public static void main(String[] args) {
        Program10_ArmstrongNumber t = new Program10_ArmstrongNumber();
        t.armstrongNumber();

    }
    public void armstrongNumber(){

        int  originalNumber, remainder, result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = scanner.nextInt();
        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    scanner.close();
    }
    }


