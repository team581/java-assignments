package assignments.booleans1;

/*
Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)

shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false
*/

public class ShareDigit {
    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
    private static boolean shareDigit(int a, int b) {
        return false;
        // Return whether the two numbers share a digit.
    }

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    private static void testShareDigit(int a, int b, boolean expected) {
        boolean result = shareDigit(a, b);
        boolean pass = result == expected;
        System.out.printf(
                "shareDigit(%d, %d) -> %b | %b | %s \n", a, b, expected, result, pass ? "OK " : "X ");
    }

    public static void main(String[] args) {
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        testShareDigit(12, 23, true);
        testShareDigit(12, 43, false);
        testShareDigit(12, 44, false);
        testShareDigit(23, 39, true);
        testShareDigit(23, 19, false);
        testShareDigit(30, 90, true);
        testShareDigit(30, 91, false);
        testShareDigit(55, 55, true);
        testShareDigit(55, 44, false);
    }
}
