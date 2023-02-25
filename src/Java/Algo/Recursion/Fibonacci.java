package Java.Algo.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int N = 3;
        int fibNumber = fibonacciRecursive(N);
        System.out.println("Fibonacci number when N = " + N + " is " + fibNumber);
    }

    public static int fibonacciRecursive(int N) {
        if (N <= 1) {
            return N;
        }
        return fibonacciRecursive(N - 1) + fibonacciRecursive(N - 2);
    }
}
