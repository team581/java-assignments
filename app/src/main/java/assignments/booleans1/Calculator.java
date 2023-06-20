package assignments.booleans1;

public class Calculator {
  // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv//

  // Create a function called calculator that takes in 3 parameters:
  //   - an integer called a
  //   - a String called operator (which can be "+", "-", "*", or "/")
  //   - an integer called b
  // Evaluate the expression (a operator b) and return the result
  private static int calculator(int a, String operator, int b) {
    // return (a operator b)
    return 0;
  }

  // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

  private static void testCalculator(int a, String operator, int b, int expected) {
    int result = calculator(a, operator, b);
    boolean pass = result == expected;
    System.out.printf(
        "calculator(%d, \"%s\", %d) -> %d | %d | %s \n",
        a, operator, b, expected, result, pass ? "OK " : "X ");
  }

  public static void main(String[] args) {
    System.out.println("Function Call -> Expected | Yours | Pass?\n");
    testCalculator(1, "+", 2, 3);
    testCalculator(1, "-", 2, -1);
    testCalculator(10, "*", 2, 20);
    testCalculator(10, "/", 2, 5);
  }
}
