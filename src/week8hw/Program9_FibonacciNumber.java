package week8hw;
//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class Program9_FibonacciNumber {
    public static void main(String[] args) {
        Program9_FibonacciNumber t = new Program9_FibonacciNumber();
        t.fibonacciNumber();

        }
    public void fibonacciNumber(){

        int n = 13, f = 0, s = 1;
        System.out.println(("Fibonacci Series till " + n + " terms:"));

        for (int i = 1; i<=n; i++){
            System.out.print(f + " , ");

            int nextterm = f + s;
            f = s;
            s = nextterm;
        }
    }
}





