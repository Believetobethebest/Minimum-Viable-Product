import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<String> myWarmUps = new ArrayList<>();
        myWarmUps.add("Toe Touches");
        myWarmUps.add("Hamstring Stretch");
        myWarmUps.add("Leg Swings");
        myWarmUps.add("Lunge Twist");
        DanceWarmUpTracker tracker = new DanceWarmUpTracker(myWarmUps, 13, "Bharatanatyam");
        String result = tracker.RoutineTracker(13);
        System.out.print(result);
    }
}
