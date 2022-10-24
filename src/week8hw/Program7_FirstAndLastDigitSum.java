package week8hw;

public class Program7_FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLAstDigit(252));
        System.out.println(sumFirstAndLAstDigit(257));
        System.out.println(sumFirstAndLAstDigit(0));
        System.out.println(sumFirstAndLAstDigit(5));
        System.out.println(sumFirstAndLAstDigit(-10));
    }
    public static int sumFirstAndLAstDigit(int number) {
    if (number <0) {
        return -1;
    }
    int lastDigit = number % 10;
    while (number >= 10){
        number /= 10;
    }
    return (number + lastDigit);
    }
}
