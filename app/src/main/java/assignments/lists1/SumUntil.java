package assignments.lists1;

import java.util.List;

public class SumUntil {
    // Create a function that calculates the sum of numbers in a list.
    // Once the sum exceeds 20, or you run out of numbers, stop adding numbers and return the sum.

    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv

    private static int sumUntil(List<Integer> input) {
        return 0;
    }

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    private static void testSumUntil(List<Integer> input, int expected) {
        System.out.println("");
        int result = sumUntil(input);
        boolean pass = result == expected;
        __testResults +=
                String.format(
                        "sumUntil(%s) -> %s | %s | %s \n", input, expected, result, pass ? "OK " : "X ");
    }

    private static String __testResults = "";

    public static void main(String[] args) {
        testSumUntil(List.of(5, 10, 6, 5), 21);
        testSumUntil(List.of(2, 4, 6), 12);
        testSumUntil(List.of(10, 10, 10), 30);
        testSumUntil(List.of(0, 0, 0), 0);
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        System.out.println(__testResults);
    }
}
