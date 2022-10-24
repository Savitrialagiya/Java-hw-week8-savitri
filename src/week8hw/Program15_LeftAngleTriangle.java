package week8hw;

//Display left angle triangle of * using nested for loops

public class Program15_LeftAngleTriangle {
    public static void main(String[] args) {
        leftAngleTriangle(5);

    }

    public static void leftAngleTriangle(int a) {
        for (int i = 0; i < a + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}

