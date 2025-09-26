public class MathUtils {
//Tests
    public static double squareRoot(double num) {
        if (num < 0) throw new IllegalArgumentException("Negative number");
        return Math.sqrt(num);
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative input");
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    public static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }

    public static int sumArray(int[] arr) {
        return java.util.Arrays.stream(arr).sum();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}