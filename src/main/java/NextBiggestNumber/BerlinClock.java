package NextBiggestNumber;

import java.util.Arrays;

/**
 * Hello world!
 */
public class BerlinClock {

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
        return getMinuteStringRepresentation(hrs, "R", 4);
    }

    private String getOneFullHour(int hours) {
        int hrs = hours % 5;
        return getMinuteStringRepresentation(hrs, "R", 4);
    }

    private String getFiveFullMins(int minutes) {
        int mm = minutes / 5;
        return getMinuteStringRepresentation(mm, "Y", 11);
    }

    private String getOneFullMin(int minutes) {
        int subMinutes = minutes % 5;
        return getMinuteStringRepresentation(subMinutes, "Y", 4);
    }

    private String getMinuteStringRepresentation(int subMinutes, String sign, int length) {
        String subMinutesString = "";
        for (int i = 0; i < length; i++) {
            if (i < subMinutes) {
                subMinutesString = subMinutesString + sign;
                continue;
            }
            subMinutesString += "O";
        }
        return subMinutesString;
    }

    private String getSeconds(int seconds) {
        String ss;
        if (seconds % 2 == 0) {
            ss = "O";
        } else {
            ss = "Y";
        }
        return ss;
    }
}
