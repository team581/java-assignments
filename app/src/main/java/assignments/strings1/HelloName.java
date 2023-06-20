package assignments.strings1;

public class HelloName {

    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
    private static String helloName(String name) {
        // return Hello {name}!
        return "";
    }

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    private static void TestHelloName(String actual, String expected) {
        String result = helloName(actual);
        boolean pass = result.equals(expected);
        System.out.printf(
                "helloName(%s) -> %s | %s | %s \n", actual, expected, result, pass ? "OK " : "X ");
    }

    public static void main(String[] args) {
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        TestHelloName("Bob", "Hello Bob!");
        TestHelloName("Alice", "Hello Alice!");
        TestHelloName("X", "Hello X!");
    }
}
