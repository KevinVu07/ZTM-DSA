package Java.Algo.Recursion;

public class Factorial {

    public static void main(String[] args) {
        int number = 5;
        int factorialNumber = findFactorialRecursive(number);
        System.out.println("Factorial number of " + number + " is " + factorialNumber);
    }

    public static int findFactorialRecursive(int number) {
        if (number == 1) return 1;
        int factorialNumber = number * findFactorialRecursive(number - 1);
        return factorialNumber;
    }

}
