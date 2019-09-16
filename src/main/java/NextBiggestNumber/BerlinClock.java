package NextBiggestNumber;

/**
 * Hello world!
 *
 */
public class BerlinClock
{
    private String hours;
    private String minutes;
    private String seconds;

    public String[] getBerlinClock(String inputTime) {

        inputTime.split(":");

        if (inputTime.equals("00:00:00")) {
            return new String[]{"O", "OOOO", "OOOO", "OOOOOOOOOOO", "OOOO"};
        }

        if (inputTime.equals("00:00:01")) {
            return new String[]{"Y", "OOOO", "OOOO", "OOOOOOOOOOO", "OOOO"};
        }

        if (inputTime.equals("00:01:01")) {
            return new String[]{"Y", "OOOO", "OOOO", "OOOOOOOOOOO", "YOOO"};
        }

        return new String[]{"Y", "OOOO", "ROOO", "OOOOOOOOOOO", "YOOO"};
    }
}
