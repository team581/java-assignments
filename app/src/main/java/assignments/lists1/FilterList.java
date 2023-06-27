package assignments.lists1;

import java.util.ArrayList;
import java.util.List;

public class FilterList {
    // Create a function that accepts two lists of strings.
    // Modify the first list so that it only contains strings that are also in the second list.
    // You probably want to use List#contains() for this.
    // Don't return anything.

    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv

    private static void filterList(ArrayList<String> input, List<String> filter) {}

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    private static void testFilterList(
            ArrayList<String> input, List<String> filter, List<String> expected) {
        System.out.println("");
        filterList(input, filter);
        boolean pass = input.equals(expected);
        __testResults +=
                String.format(
                        "filterList(%s, %s) -> %s | %s | %s \n",
                        input, filter, expected, input, pass ? "OK " : "X ");
    }

    private static String __testResults = "";

    public static void main(String[] args) {
        testFilterList(
                new ArrayList(List.of("a", "b", "c")), List.of("a", "b", "c"), List.of("a", "b", "c"));
        testFilterList(
                new ArrayList(List.of("a", "b", "c")), List.of("a", "b", "d"), List.of("a", "b"));
        testFilterList(new ArrayList(List.of("a", "b", "c")), List.of("d", "e", "f"), List.of());
        testFilterList(new ArrayList(List.of("a", "b", "c")), List.of(), List.of());
        testFilterList(new ArrayList(), List.of("a", "b", "c"), List.of());
        testFilterList(new ArrayList(), List.of(), List.of());
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        System.out.println(__testResults);
    }
}
