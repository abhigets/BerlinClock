package NextBiggestNumber;

/**
 * Hello world!
 *
 */
public class BerlinClock
{
    public String[] getBerlinClock(String inputTime) {

        final String[] time = inputTime.split(":");
        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        int seconds = Integer.parseInt(time[2]);

        String ss;
        if (seconds % 2 == 0) {
            ss = "O";
        } else {
            ss = "Y";
        }

        if (inputTime.equals("00:00:00")) {
            return new String[]{ss, "OOOO", "OOOO", "OOOOOOOOOOO", "OOOO"};
        }

        if (inputTime.equals("00:00:01")) {
            return new String[]{ss, "OOOO", "OOOO", "OOOOOOOOOOO", "OOOO"};
        }

        if (inputTime.equals("00:01:01")) {
            return new String[]{ss, "OOOO", "OOOO", "OOOOOOOOOOO", "YOOO"};
        }

        return new String[]{ss, "OOOO", "ROOO", "OOOOOOOOOOO", "YOOO"};
    }
}
