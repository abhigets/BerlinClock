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

        String ss = getSeconds(seconds);

        String subMinutesString = getSubMinutes(minutes);

        int mm = minutes / 5;


        return new String[]{ss, "OOOO", "OOOO", "OOOOOOOOOOO", subMinutesString};
    }

    private String getSubMinutes(int minutes) {
        String subMinutesString = "";
        int subMinutes = minutes % 5;
        for(int i = 0; i < 4 ; i++){
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
