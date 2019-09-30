package NextBiggestNumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BerlinClockShould
{
    BerlinClock myBerlinClock;
    @BeforeEach
    public void setup(){
        myBerlinClock = new BerlinClock();
    }

    @Test
    public void return_all_ligts_off_when_input_00_00_00() {
        assertArrayEquals(
                new String[]{ "O","OOOO","OOOO","OOOOOOOOOOO","OOOO"},
                myBerlinClock.getBerlinClock("00:00:00")
        );
    }

    @Test
    public void given_I_enter_a_00_00_01_i_should_get_representation_of_01() {
        assertArrayEquals(
                new String[]{ "Y","OOOO","OOOO","OOOOOOOOOOO","OOOO"},
                myBerlinClock.getBerlinClock("00:00:01")
        );
    }

    @Test
    public void given_I_enter_a_00_01_01_i_should_get_representation_of_1_minute_and_1_second() {
        assertArrayEquals(
                new String[]{ "Y","OOOO","OOOO","OOOOOOOOOOO","YOOO"},
                myBerlinClock.getBerlinClock("00:01:01")
        );
    }

    @Test
    public void return_YYOO_for_2_minutes() {
        assertArrayEquals(
                new String[]{ "Y","OOOO","OOOO","OOOOOOOOOOO","YYOO"},
                myBerlinClock.getBerlinClock("00:02:01")
        );
    }

    @Test
    public void return_YYYO_for_3_minutes() {
        assertArrayEquals(
                new String[]{ "Y","OOOO","OOOO","OOOOOOOOOOO","YYYO"},
                myBerlinClock.getBerlinClock("00:03:01")
        );
    }

    @Test
    public void return_YYYY_for_4_minutes() {
        assertArrayEquals(
                new String[]{ "Y","OOOO","OOOO","OOOOOOOOOOO","YYYY"},
                myBerlinClock.getBerlinClock("00:04:01")
        );
    }

    @Test
    @Disabled
    public void given_I_enter_a_01_01_01_i_should_get_representation_of_1_hour_1_minute_and_1_second() {
        assertArrayEquals(
                new String[]{ "Y","OOOO","ROOO","OOOOOOOOOOO","YOOO"},
                myBerlinClock.getBerlinClock("01:01:01")
        );
    }
}
