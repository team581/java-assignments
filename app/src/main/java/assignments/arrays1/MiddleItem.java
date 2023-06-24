package assignments.arrays1;

public class MiddleItem {
    // Create a function middleItem which takes an array of Strings and returns the middle item in that
    // array

    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv//

    private static String middleItem(String[] arr) {
        return "(middle item)";
    }

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    private static void testMiddleItem(String[] arr, String expected) {
        String result = middleItem(arr);
        boolean pass = result.equals(expected);
        System.out.printf(
                "middleItem(%s) -> %s | %s | %s \n",
                java.util.Arrays.toString(arr), expected, result, pass ? "OK " : "X ");
    }

    public static void main(String[] args) {
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        testMiddleItem(new String[] {"a", "b", "c", "d", "e"}, "c");
        testMiddleItem(new String[] {"a", "b", "c", "d", "e", "f", "g"}, "d");
        testMiddleItem(new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i"}, "e");
    }
}
