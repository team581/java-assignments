/*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
*/
public class Main {
    private static boolean sleepIn(boolean weekday, boolean vacation) {
        return false; // return whether you should sleep in today.
    }
    private static void TestSleepIn(boolean weekday, boolean vacation, boolean expected) {
        boolean result = sleepIn(weekday, vacation);
        boolean pass = result == expected;
        System.out.printf("SleepIn(%b, %b) -> %b | %b | %s \n", weekday, vacation, expected, result, pass ? "OK " : "X ");
    }
    public static void main(String[] args) {
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        TestSleepIn(false, false, true);
        TestSleepIn(true, false, false);
        TestSleepIn(false, true, true);
        TestSleepIn(true, true, true);
    }
}