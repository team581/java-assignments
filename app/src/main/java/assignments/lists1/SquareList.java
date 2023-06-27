package assignments.lists1;

import java.util.ArrayList;
import java.util.List;

public class SquareList {
    // Create a function that accepts a list of ints and returns a list of the squares of those ints.

    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv

    private static List<Integer> squareList(List<Integer> input) {
        return new ArrayList<>();
    }

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    private static void testSquareList(List<Integer> input, List<Integer> expected) {
        System.out.println("");
        List<Integer> result = squareList(input);
        boolean pass = result.equals(expected);
        __testResults +=
                String.format(
                        "squareList(%s) -> %s | %s | %s \n", input, expected, result, pass ? "OK " : "X ");
    }

    private static String __testResults = "";

    public static void main(String[] args) {
        testSquareList(List.of(1, 2, 3), List.of(1, 4, 9));
        testSquareList(List.of(2, 4, 6), List.of(4, 16, 36));
        testSquareList(List.of(0, 0, 0), List.of(0, 0, 0));
        testSquareList(List.of(-1, -2, -3), List.of(1, 4, 9));
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        System.out.println(__testResults);
    }
}
