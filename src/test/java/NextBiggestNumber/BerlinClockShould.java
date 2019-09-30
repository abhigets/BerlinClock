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
            "O, OOOO, OOOO, OOOOOOOOOOOO, OOOO, 00:00:00",
            "Y, OOOO, OOOO, OOOOOOOOOOOO, OOOO, 00:00:01",
            "Y, OOOO, OOOO, OOOOOOOOOOOO, YOOO, 00:01:01",
            "Y, OOOO, OOOO, OOOOOOOOOOOO, YYOO, 00:02:01",
            "Y, OOOO, OOOO, OOOOOOOOOOOO, YYYO, 00:03:01",
            "Y, OOOO, OOOO, OOOOOOOOOOOO, YYYY, 00:04:01",
            "Y, OOOO, OOOO, YOOOOOOOOOOO, OOOO, 00:05:01",
            "Y, OOOO, OOOO, YYOOOOOOOOOO, OOOO, 00:10:01",
            "Y, OOOO, OOOO, YYYOOOOOOOOO, YYOO, 00:17:01"
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
}
