package week8hw;
/**Write a Java program that takes the user to provide a single character from the
 alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 error message.
 */

import java.util.Locale;
import java.util.Scanner;

public class Program3_VovelOrConsonant {
    public static void main(String[] args) {
        Program3_VovelOrConsonant obj = new Program3_VovelOrConsonant();
        obj.vovelOrConsonant();

    }

    public void vovelOrConsonant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        String letter = scanner.next().toLowerCase(Locale.ROOT);
        boolean uppercase = letter.charAt(0) >= 65 && letter.charAt(0) <= 90;
        boolean lowercase = letter.charAt(0) >= 97 && letter.charAt(0) <= 122;

        if (letter.length() > 1) {
            System.out.println("error- not a letter");
        } else if (!(uppercase || lowercase)) {
            System.out.println("error not a letter");
        } else if (letter.charAt(0) == 'a' || letter.charAt(0) == 'e' || letter.charAt(0) == 'i' || letter.charAt(0) == 'o' || letter.charAt(0) == 'u' ||
                letter.charAt(0) == 'A' || letter.charAt(0) == 'E' || letter.charAt(0) == 'I' || letter.charAt(0) == 'O' || letter.charAt(0) == 'U') {
            {
                System.out.println(letter + " Input letter is vovel ");
            }
        } else
            System.out.println(letter + " Input letter is consonant ");
        scanner.close();
    }
}

