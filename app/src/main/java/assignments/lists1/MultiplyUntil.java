package assignments.lists1;

public class MultiplyUntil {
    // Create a function that accepts an int and multiplies it by 3.
    // Store that number, and keep multiplying by 3 until the number is greater than 100.
    // Count the number of times you multiplied, and return that number.

    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
    private static int multiplyUntil(int value) {
        return 0;
    }

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    private static void testMultiplyUntil(int input, int expected) {
        System.out.println("");
        int result = multiplyUntil(input);
        boolean pass = result == expected;
        __testResults +=
                String.format(
                        "multiplyUntil(%d) -> %d | %d | %s \n", input, expected, result, pass ? "OK " : "X ");
    }

    private static String __testResults = "";

    public static void main(String[] args) {
        testMultiplyUntil(1, 5);
        testMultiplyUntil(2, 4);
        testMultiplyUntil(40, 1);
        testMultiplyUntil(200, 0);
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        System.out.println(__testResults);
    }
}
