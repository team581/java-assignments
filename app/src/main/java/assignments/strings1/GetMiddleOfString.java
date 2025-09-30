package assignments.strings1;

public class GetMiddleOfString {
    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
    private static String getMiddleOfString(String input) {
        // return the middle 2 letters of an even numbered string
        int startIndex = 0;
        int endIndex = 0;
        return input.substring(startIndex, endIndex);
    }

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    private static void TestGetMiddleOfString(String input, String expected) {
        String result = getMiddleOfString(input);
        boolean pass = result == expected;
        System.out.printf(
                "getMiddleOfString(%s) -> %s | %s | %s \n", input, expected, result, pass ? "OK " : "X ");
    }

    public static void main(String[] args) {
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        TestGetMiddleOfString("code", "od");
        TestGetMiddleOfString("java", "av");
        TestGetMiddleOfString("python", "th");
        TestGetMiddleOfString("apples", "pl");
    }
}
