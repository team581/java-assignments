/*
Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator
*/
public class Main {
//vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
    private static boolean old35(int n) {
        return false;
    }
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
    private static void TestOld35(int n, boolean expected) {
        boolean result = old35(n);
        boolean pass = result == expected;
        System.out.printf("old35(\"%d\") -> \"%b\" | \"%b\" | %s \n", n, expected, result, pass ? "OK " : "X ");
    }
    public static void main(String[] args) {
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        TestOld35(3, true);
        TestOld35(10, true);
        TestOld35(15, false);
        TestOld35(5, true);
        TestOld35(9, true);
        TestOld35(8, false);
        TestOld35(7, false);
        TestOld35(6, true);
        TestOld35(17, false);
        TestOld35(18, true);
        TestOld35(29, false);
        TestOld35(20, true);
        TestOld35(21, true);
        TestOld35(22, false);
        TestOld35(45, false);
        TestOld35(99, true);
    }
}