package assignments.arrays1;

public class ReverseArray {
    // Create a function reverseArray which takes an array of integers and returns a new array with
    // the integers in reverse order

    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
    private static int[] reverseArray(int[] arr) {
        return null;
    }

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    private static void testReverseArray(int[] arr, int[] expected) {
        int[] result = reverseArray(arr);
        boolean pass = java.util.Arrays.equals(result, expected);
        System.out.printf(
                "reverseArray(%s) -> %s | %s | %s \n",
                java.util.Arrays.toString(arr),
                java.util.Arrays.toString(expected),
                java.util.Arrays.toString(result),
                pass ? "OK " : "X ");
    }

    public static void main(String[] args) {
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        testReverseArray(new int[] {1, 2, 3, 4, 5}, new int[] {5, 4, 3, 2, 1});
        testReverseArray(new int[] {1, 2, 3, 4, 5, 6}, new int[] {6, 5, 4, 3, 2, 1});
        testReverseArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1});
    }
}
