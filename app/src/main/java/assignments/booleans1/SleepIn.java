package assignments.booleans1;

/*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
*/
public class SleepIn {
    private static boolean sleepIn(boolean weekday, boolean vacation) {
        return false; // return whether you should sleep in today.
    }

    private static void testSleepIn(boolean weekday, boolean vacation, boolean expected) {
        boolean result = sleepIn(weekday, vacation);
        boolean pass = result == expected;
        System.out.printf(
                "sleepIn(%b, %b) -> %b | %b | %s \n",
                weekday, vacation, expected, result, pass ? "OK " : "X ");
    }

    public static void main(String[] args) {
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        testSleepIn(false, false, true);
        testSleepIn(true, false, false);
        testSleepIn(false, true, true);
        testSleepIn(true, true, true);
    }
}
