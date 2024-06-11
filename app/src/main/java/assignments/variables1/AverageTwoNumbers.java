package assignments.variables1;

public class AverageTwoNumbers {
    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
    private static int averageTwoNumbers(int firstNumber, int secondNumber) {
        // Compute the average of two input numbers.
        return 0;
    }

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    private static void testAverageTwoNumbers(int firstNumber, int secondNumber, int expected) {
        double result = averageTwoNumbers(firstNumber, secondNumber);
        boolean pass = Math.abs(result - expected) < 0.001;
        System.out.printf(
                "averageTwoNumbers(%s, %s) -> %s | %s | %s \n",
                firstNumber, secondNumber, expected, result, pass ? "OK " : "X ");
    }

    public static void main(String[] args) {
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        testAverageTwoNumbers(1, 3, 2);
        testAverageTwoNumbers(2, 2, 2);
        testAverageTwoNumbers(16, 19, 17);
        testAverageTwoNumbers(-581, 581, 0);
    }
}
