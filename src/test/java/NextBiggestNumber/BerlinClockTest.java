package NextBiggestNumber;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class BerlinClockTest
{
    BerlinClock myBerlinClock;
    @Before
    public void setup(){
        myBerlinClock = new BerlinClock();
    }

    @Test
    public void given_I_enter_a_00_00_00_i_should_get_all_lights_off() {
        assertArrayEquals(new String[]{ "O","OOOO","OOOO","OOOOOOOOOOO","OOOO"}, myBerlinClock.getBerlinClock("00:00:00"));
    }

    @Test
    public void given_I_enter_a_00_00_01_i_should_get_representation_of_01() {
        assertArrayEquals(new String[]{ "Y","OOOO","OOOO","OOOOOOOOOOO","YOOO"}, myBerlinClock.getBerlinClock("00:00:01"));
    }
}
