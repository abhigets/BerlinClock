package NextBiggestNumber;

import java.util.Arrays;

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

        System.out.println(Arrays.toString(time));

        String sec = getSeconds(seconds);

        String oneFullMinString = getOneFullMin(minutes);

        String fiveFullMins = getFiveFullMins(minutes);





        return new String[]{sec, "OOOO", "OOOO", fiveFullMins, oneFullMinString};
    }

    private String getFiveFullMins(int minutes) {
        int mm = minutes / 5;
        return getMinuteStringRepresentation(mm,12);
    }

    private String getOneFullMin(int minutes) {
        int subMinutes = minutes % 5;
        return getMinuteStringRepresentation(subMinutes,4);
    }

    private String getMinuteStringRepresentation(int subMinutes, int length) {
        String subMinutesString = "";
        for(int i = 0; i < length ; i++){
            if(i< subMinutes) {
                subMinutesString = subMinutesString + "Y";
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
