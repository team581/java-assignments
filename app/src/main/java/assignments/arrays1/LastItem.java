package assignments.arrays1;

public class LastItem {
    // Create a function lastItem which takes an array of integers and returns the last item in that
    // array

    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
    private static int lastItem(int[] arr) {
        return 0;
    }

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    private static void testLastItem(int[] arr, int expected) {
        int result = lastItem(arr);
        boolean pass = result == expected;
        System.out.printf(
                "lastItem(%s) -> %d | %d | %s \n",
                java.util.Arrays.toString(arr), expected, result, pass ? "OK " : "X ");
    }

    public static void main(String[] args) {
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        testLastItem(new int[] {1, 2, 3, 4, 5}, 5);
        testLastItem(new int[] {1, 2, 3, 4, 5, 6, 7}, 7);
        testLastItem(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10);
    }
}
