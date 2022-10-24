package week8hw;

/**Write a method named getEvenDigitSum with one parameter of type int called number.
 The method should return the sum of the even digits within the number.
 If the number is negative, the method should return -1 to indicate an invalid value.
 */
public class Program11_GetEvenDigitSum {
    public static void main(String[] args) {

        int sum = 0;
        sum = getEvenDigitSum(252);
       // sum = getEvenDigitSum(123456789);
        //sum = getEvenDigitSum(-22);
        System.out.println("sum of even number is : " + sum);

    }

    public static int getEvenDigitSum(int number){
     if(number < 0){
         return  -1;
     }
     int sum = 0;
     int lastdigit = 0;
     while (number > 0){
         lastdigit = number % 10;
         if (number % 2 == 0){
             sum += lastdigit;
             number /=10;
         }
         else {
             number /=10;
             continue;
         }
     }return sum;
    }
}
