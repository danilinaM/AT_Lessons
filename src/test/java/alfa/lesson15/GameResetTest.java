package alfa.lesson15;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameResetTest {

    static Map<String, BoardGame> gamesMap = new HashMap<>();

    @BeforeAll
    public static void fillArray() {
        gamesMap.put("Monopoly", new BoardGame("Monopoly", 5, 2000));
        gamesMap.put("Cards", new BoardGame("Cards", 50, 200));
        gamesMap.put("Chess", new BoardGame("Chess", 12, 10000));
    }

    @AfterAll
    public static void clearArray() {
        gamesMap.clear();
    }

    @ParameterizedTest
    @CsvSource({
            "Monopoly,true, Game is avaialable",
            "Cards,true, Game is avaialable",
            "Chess,true, Game is avaialable"
    })
    public void testResetGames(String name, boolean isAvailable, String message) {
        assertEquals(!gamesMap.get(name).isRented(), isAvailable, message);
    }
}
