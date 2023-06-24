package assignments.arrays1;

public class CombineNames {
    // Create a function combineStrings which takes two arrays of Strings with equal length, one for
    // first names and one for last names. Return a new array of Strings with the full names of each
    // person.
    // ex. combineStrings(["Adam", "Shelby"], ["Heard", "Anderson"]) ->
    // ["Adam Heard", "Shelby Anderson"]

    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv//

    private static String[] combineStrings(String[] firstNames, String[] lastNames) {
        return null;
    }

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    private static void testCombineStrings(
            String[] firstNames, String[] lastNames, String[] expected) {
        String[] result = combineStrings(firstNames, lastNames);
        boolean pass = java.util.Arrays.equals(result, expected);
        System.out.printf(
                "combineStrings(%s, %s) -> %s | %s | %s \n",
                java.util.Arrays.toString(firstNames),
                java.util.Arrays.toString(lastNames),
                java.util.Arrays.toString(expected),
                java.util.Arrays.toString(result),
                pass ? "OK " : "X ");
    }

    public static void main(String[] args) {
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        testCombineStrings(
                new String[] {"Adam", "Shelby"},
                new String[] {"Heard", "Anderson"},
                new String[] {"Adam Heard", "Shelby Anderson"});
        testCombineStrings(
                new String[] {"Adam", "Shelby", "Abhinav"},
                new String[] {"Heard", "Anderson", "Prasad"},
                new String[] {"Adam Heard", "Shelby Anderson", "Abhinav Prasad"});
    }
}
