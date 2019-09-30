package NextBiggestNumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BerlinClockShould {

    private BerlinClock myBerlinClock;

    @BeforeEach
    public void setup() {
        myBerlinClock = new BerlinClock();
    }

    @ParameterizedTest
    @CsvSource({
            "O, OOOO, OOOO, OOOOOOOOOOO, OOOO, 00:00:00",
            "Y, OOOO, OOOO, OOOOOOOOOOO, OOOO, 00:00:01",
            "Y, OOOO, OOOO, OOOOOOOOOOO, YOOO, 00:01:01",
            "Y, OOOO, OOOO, OOOOOOOOOOO, YYOO, 00:02:01",
            "Y, OOOO, OOOO, OOOOOOOOOOO, YYYO, 00:03:01",
            "Y, OOOO, OOOO, OOOOOOOOOOO, YYYY, 00:04:01"
    })
    void testWithParameters(String sec,
                            String fiveFullHrs,
                            String oneFullHr,
                            String fiveFullMins,
                            String oneFullMin,
                            String berlinClockInput) {

        assertArrayEquals(
                new String[] { sec, fiveFullHrs, oneFullHr, fiveFullMins, oneFullMin },
                myBerlinClock.getBerlinClock(berlinClockInput)
        );

    }

    @Test
    @Disabled
    public void given_I_enter_a_01_01_01_i_should_get_representation_of_1_hour_1_minute_and_1_second() {
        assertArrayEquals(
                new String[]{"Y", "OOOO", "ROOO", "OOOOOOOOOOO", "YOOO"},
                myBerlinClock.getBerlinClock("01:01:01")
        );
    }
}
