import java.util.ArrayList;
import java.util.List;

public class DanceWarmUpTracker
{
    private final List<String> warmup;
    private int totalWarmUps;
    private int duration;
    private int totalDuration;
    private final String style;

    public DanceWarmUpTracker(ArrayList<String> warmup, int duration, String style)
    {
        totalWarmUps = 0;
        this.warmup = warmup;
        this.duration = duration;
        this.style = style;
        totalDuration = 0;
    }

    public String RoutineTracker(int duration) {
        totalWarmUps = 0;
        for (String exercise : warmup) {
            if (exercise != null) {
                totalWarmUps++;
            }
        }

        String comment = "";
        if (duration < 10 || (totalWarmUps > 0 && totalWarmUps <= 3)) {
            comment = "Not enough!";
        } else if (duration > 10 && duration < 15 || (totalWarmUps > 4 && totalWarmUps <= 7)) {
            comment = "Can do more!";
        } else if (duration > 15 && duration < 20 || (totalWarmUps > 7 && totalWarmUps <= 10)) {
            comment = "Standard amount!";
        }
        totalDuration += duration;

        return comment;
    }

    public String getStyle()
    {
        return style;
    }

    public int getDuration()
    {
        return totalDuration;
    }
}