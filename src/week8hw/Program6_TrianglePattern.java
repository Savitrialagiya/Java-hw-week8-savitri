package week8hw;
/**Write a program in Java to display the pattern like a triangle with a number.
 For eg.
 Input number of rows: 10
 */

import java.util.Scanner;

public class Program6_TrianglePattern {
    public static void main(String[] args) {
        Program6_TrianglePattern t = new Program6_TrianglePattern();
        t.trianglePattern();
    }
    public void trianglePattern(){
        int i,j,n;
        System.out.print("Input number of rows : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i=1 ; i<=n;i++){
            for (j=1; j<=i; j++)
                System.out.print(j);
            System.out.println("");
      }sc.close();

    }
}
