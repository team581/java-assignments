/*
Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)

shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false
*/

public class Main {
//vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
    private static boolean shareDigit(int a, int b) {
        return false;
        // Return whether the two numbers share a digit.
    }
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
    private static void TestShareDigit(int a, int b, boolean expected) {
        boolean result = shareDigit(a, b);
        boolean pass = result == expected;
        System.out.printf("SleepIn(%d, %d) -> %b | %b | %s \n", a, b, expected, result, pass ? "OK " : "X ");
    }
    public static void main(String[] args) {
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        TestShareDigit(12, 23, true);
        TestShareDigit(12, 43, false);
        TestShareDigit(12, 44, false);
        TestShareDigit(23, 39, true);
        TestShareDigit(23, 19, false);
        TestShareDigit(30, 90, true);
        TestShareDigit(30, 91, false);
        TestShareDigit(55, 55, true);
        TestShareDigit(55, 44, false);
    }

}
