package assignments.strings1;

public class GetLastTwoLetters {
    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
    private static String getLastTwoLetters(String input) {
        // return (last 2 letters)
        return "";
    }

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    private static void testGetLastTwoLetters(String input, String expected) {
        String result = getLastTwoLetters(input);
        boolean pass = result.equals(expected);
        System.out.printf(
                "getLastTwoLetters(%s) -> %s | %s | %s \n", input, expected, result, pass ? "OK " : "X ");
    }

    public static void main(String[] args) {
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        testGetLastTwoLetters("Hello", "lo");
        testGetLastTwoLetters("Java", "va");
        testGetLastTwoLetters("Hi", "Hi");
    }
}
