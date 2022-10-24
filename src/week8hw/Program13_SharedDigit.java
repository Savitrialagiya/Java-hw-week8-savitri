package week8hw;

/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false
 */
public class Program13_SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));


    }
    public static boolean hasSharedDigit(int firstnumber, int secondnumber){
        if((firstnumber >= 10 && firstnumber <=99) && (secondnumber >= 10 && secondnumber <=99)){
            int firstNumberLastDigit = firstnumber % 10;
            int secondNumberLastDigit = secondnumber % 10;
            firstnumber /= 10;
            secondnumber /= 10;
            int firstNumberFirstDigit = firstnumber ;
            int secondNumberFirstDigit = secondnumber;
            System.out.println("Is there any shared digit in both given numbers?");
            return ((firstNumberFirstDigit == secondNumberFirstDigit) ||
                    (firstNumberFirstDigit == secondNumberLastDigit) ||
                    (firstNumberLastDigit == secondNumberFirstDigit) ||
                    (firstNumberLastDigit == secondNumberLastDigit));
        }
        System.out.println("Invalid input.");
        return false;
    }
}
