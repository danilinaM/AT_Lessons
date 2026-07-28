package alfa.lesson15;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardGameTest {

    BoardGame boardGame = new BoardGame("Catan",10,1000);
    int ageLimit = boardGame.getMinAge();

    @ParameterizedTest
    @CsvSource({
            "-11,false,Client is too young",
            "0,false,Client is too young",
            "9,false,Client is too young",
            "10,true,Client is old enough to play"
    })
    public void testAgeLimit(int age, boolean canPlay, String message) {

        boolean check = age >= ageLimit;
        assertEquals(canPlay, check, message);
    }
}
