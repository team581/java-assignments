package assignments.arrays1;

public class AverageArray {
    // Create a function averageArray which takes an array of integers and returns the average of that
    // array (as an integer)

    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv//

    private static int averageArray(int[] arr) {
        return 0;
    }

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    private static void testAverageArray(int[] arr, int expected) {
        int result = averageArray(arr);
        boolean pass = result == expected;
        System.out.printf(
                "averageArray(%s) -> %d | %d | %s \n",
                java.util.Arrays.toString(arr), expected, result, pass ? "OK " : "X ");
    }

    public static void main(String[] args) {
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        testAverageArray(new int[] {1, 2, 3, 4, 5}, 3);
        testAverageArray(new int[] {3, 3, 3}, 3);
        testAverageArray(new int[] {10, 20, 25}, 18);
        testAverageArray(new int[] {50, 50, 0}, 33);
    }
}
