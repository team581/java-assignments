package assignments.ints1;

public class ThirdPower {
    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
    private static int calculateThirdPower(int number) {
        // return (number to third power)
        return 0;
    }

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    private static void testCalculateThirdPower(int input, int expected) {
        int result = calculateThirdPower(input);
        boolean pass = result == expected;
        System.out.printf(
                "calculateThirdPower(%d) -> %d | %d | %s \n", input, expected, result, pass ? "OK " : "X ");
    }

    public static void main(String[] args) {
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        testCalculateThirdPower(2, 8);
        testCalculateThirdPower(5, 125);
        testCalculateThirdPower(0, 0);
    }
}
