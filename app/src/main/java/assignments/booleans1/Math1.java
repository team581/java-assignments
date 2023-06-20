package assignments.booleans1;

public class Math1 {
    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv//

    // Create a function doMath() which takes 3 booleans and returns an integer
    // Start with the integer value at 0, and based off the parameters, update it:
    // - If a is true, add 7
    // - If b is true, subtract 3
    // - if c is true, multiply by 2
    // And then return the result

    private static int doMath(boolean a, boolean b, boolean c) {
        return 0;
    }

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    private static void testDoMath(boolean a, boolean b, boolean c, int expected) {
        int result = doMath(a, b, c);
        boolean pass = result == expected;
        System.out.printf(
                "doMath(%s, %s, %s) -> %d | %d | %s \n", a, b, c, expected, result, pass ? "OK " : "X ");
    }

    public static void main(String[] args) {
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        testDoMath(false, false, false, 0);
        testDoMath(false, false, true, 0);
        testDoMath(false, true, false, -3);
        testDoMath(false, true, true, -6);
        testDoMath(true, false, false, 7);
        testDoMath(true, false, true, 14);
        testDoMath(true, true, false, 4);
        testDoMath(true, true, true, 8);
    }
}
