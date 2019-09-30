package NextBiggestNumber;

import org.junit.jupiter.api.BeforeEach;
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
            "Y, OOOO, OOOO, OOOOOOOOOOO, YYYY, 00:04:01",
            "Y, OOOO, OOOO, YOOOOOOOOOO, OOOO, 00:05:01",
            "Y, OOOO, OOOO, YYOOOOOOOOO, OOOO, 00:10:01",
            "Y, OOOO, OOOO, YYYOOOOOOOO, YYOO, 00:17:01",
            "O, OOOO, ROOO, OOOOOOOOOOO, OOOO, 01:00:00",
            "Y, OOOO, RROO, OOOOOOOOOOO, OOOO, 02:00:01",
            "O, OOOO, RRRR, OOOOOOOOOOO, OOOO, 04:00:00",
            "O, ROOO, OOOO, YYYYYYYYYYO, OOOO, 05:50:00",
            "Y, RROO, RROO, YYYYYYYYYYY, YOOO, 12:56:01"
    })
    void testWithParameters(String sec,
                            String fiveFullHrs,
                            String oneFullHr,
                            String fiveFullMins,
                            String oneFullMin,
                            String berlinClockInput) {

        assertArrayEquals(
                new String[]{sec, fiveFullHrs, oneFullHr, fiveFullMins, oneFullMin},
                myBerlinClock.getBerlinClock(berlinClockInput)
        );
    }
}
