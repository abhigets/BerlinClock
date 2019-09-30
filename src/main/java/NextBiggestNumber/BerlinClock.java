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

        String sec = getSeconds(seconds);

        String oneFullMinString = getOneFullMin(minutes);

        String fiveFullMins = getFiveFullMins(minutes);

        String oneFullHr = getOneFullHour(hours);

        String fiveFullHrs = getFiveFullHours(hours);

        return new String[]{sec, fiveFullHrs, oneFullHr, fiveFullMins, oneFullMinString};
    }

    private String getFiveFullHours(int hours) {
        int hrs = hours / 5;
        return getColouredFields(hrs, RED_LIGHT, 4);
    }

    private String getOneFullHour(int hours) {
        int hrs = hours % 5;
        return getColouredFields(hrs, RED_LIGHT, 4);
    }

    private String getFiveFullMins(int minutes) {
        int mm = minutes / 5;
        return getColouredFields(mm, YELLOW_LIGHT, 11);
    }

    private String getOneFullMin(int minutes) {
        int subMinutes = minutes % 5;
        return getColouredFields(subMinutes, YELLOW_LIGHT, 4);
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

    private String getSeconds(int seconds) {
        return seconds % 2 == 0 ? OFF_LIGHT : YELLOW_LIGHT;
    }
}
