package week8hw;
//Display right angle triangle of @ using nested for loops
import java.util.Scanner;

public class Program8_RightAngleTriangle {
    public static void main(String[] args) {
        Program8_RightAngleTriangle t = new Program8_RightAngleTriangle();
        t.rightAngleTriangle();
    }

    public void rightAngleTriangle(){
        int i,j,rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        rows = sc.nextInt();

        for (i=1; i<=rows; i++)
        {
            for (j=1; j<=i; j++){
                System.out.print("@ ");
            }
            System.out.println("");
        }
        sc.close();
        }
    }

