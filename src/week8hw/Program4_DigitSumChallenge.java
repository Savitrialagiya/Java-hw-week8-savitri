package week8hw;

/**Write a method with the name sumDigits that has one int parameter called number.
 If the parameter is >= 10 then the method should process the number and return sum of all digits,
 otherwise return -1 to indicate an invalid value.
 The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 negative numbers, so also return -1 for negative numbers.
 */
public class Program4_DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("sum of 125 is = " + sumDigit(125));
        System.out.println("sum of 854 is = " + sumDigit(854));
        System.out.println("sum of 18 is = " + sumDigit(18));
        System.out.println("sum of -3 is = " + sumDigit(-3));

    }
    public static int sumDigit(int number) {
        if (number < 10) {
            return -1;
        }

        int sumDigit = 0;
        // Convert number to string
        String numberToString = Integer.toString(number);
         // Map through all char of the string
        for (char c : numberToString.toCharArray()) {
            //convert the char to number again
            sumDigit += Integer.parseInt(String.valueOf(c));
        }
        return sumDigit;
    }
}



