package week8hw;

import java.util.Scanner;

//Write a programme to input any number and check if it is prime or not.
public class Program12_PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not : ");
        int number = sc.nextInt();
        if (isPrime(number)){
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
        sc.close();
    }
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for (int i =2;i <= num/2; i++) {
            if ((num %i) ==0)
                return false;
        }return true;
    }
}
