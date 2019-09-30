package NextBiggestNumber;

import java.util.Arrays;

/**
 * Hello world!
 */
public class BerlinClock {

    public static final String RED_LIGHT = "R";
    public static final String YELLOW_LIGHT = "Y";
    public static final String OFF_LIGHT = "O";

    public String[] getBerlinClock(String inputTime) {

        final String[] time = inputTime.split(":");
        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        int seconds = Integer.parseInt(time[2]);

        System.out.println(Arrays.toString(time));

        String sec = getColouredSeconds(seconds);

        String oneFullMinString = getMinor(minutes, YELLOW_LIGHT);

        String fiveFullMins = getFiveFullMins(minutes);

        String oneFullHr = getMinor(hours, RED_LIGHT);

        String fiveFullHrs = getFiveFullHours(hours);

        return new String[]{sec, fiveFullHrs, oneFullHr, fiveFullMins, oneFullMinString};
    }

    private String getMinor(int clockData, String colour) {
        return getColouredFields(clockData % 5, colour, 4);
    }

    private String getFiveFullHours(int hours) {
        int hrs = hours / 5;
        return getColouredFields(hrs, RED_LIGHT, 4);
    }

    private String getFiveFullMins(int minutes) {
        int mm = minutes / 5;
        return getColouredFields(mm, YELLOW_LIGHT, 11);
    }

    private String getColouredFields(int subMinutes, String sign, int length) {
        StringBuilder subMinutesString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i < subMinutes) {
                subMinutesString.append(sign);
                continue;
            }
            subMinutesString.append(OFF_LIGHT);
        }
        return subMinutesString.toString();
    }

    private String getColouredSeconds(int seconds) {
        return seconds % 2 == 0 ? OFF_LIGHT : YELLOW_LIGHT;
    }
}
