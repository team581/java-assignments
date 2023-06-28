package assignments.lists1;

import java.util.ArrayList;
import java.util.List;

public class SplitString {
    // Create a function that accepts a string, splits it into each character, and then returns a list
    // of the characters

    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv

    private static ArrayList<String> splitString(String input) {
        return new ArrayList<String>();
    }

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    private static void testSplitString(String input, List<String> expected) {
        System.out.println("");
        List<String> result = splitString(input);
        boolean pass = result.equals(expected);
        __testResults +=
                String.format(
                        "splitString(\"%s\") -> %s | %s | %s \n", input, expected, result, pass ? "OK " : "X ");
    }

    private static String __testResults = "";

    public static void main(String[] args) {
        testSplitString("Hello", List.of("H", "e", "l", "l", "o"));
        testSplitString("World", List.of("W", "o", "r", "l", "d"));
        testSplitString("Hello World", List.of("H", "e", "l", "l", "o", " ", "W", "o", "r", "l", "d"));
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        System.out.println(__testResults);
    }
}
