
public class MathOperations {
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static double divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) x / y;
    }
}

