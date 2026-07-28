package alfa.lesson15;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GameSearchTest {

    static Map<String,BoardGame> gamesMap = new HashMap<>();

    @BeforeAll
    public static void fillArray() {
        gamesMap.put("Monopoly",new BoardGame("Monopoly", 5, 2000));
        gamesMap.put("Cards",new BoardGame("Cards", 50, 200));
        gamesMap.put("Chess",new BoardGame("Chess", 12, 10000));
    }

    @AfterAll
    public static void clearArray() {
        gamesMap.clear();
    }

    public static Stream<Arguments> gameNotFoundProvider() {
        return Stream.of(
                Arguments.arguments("Domino", "Такой игры нет в списке"),
                Arguments.arguments("Noname", "Такой игры нет в списке"),
                Arguments.arguments("Card", "Такой игры нет в списке")
        );
    }

    @ParameterizedTest
    @MethodSource("gameNotFoundProvider")
    public void testSearchNullGame(String gameName, String message) {
        assertNull(GameRental.searchGame(gameName,gamesMap),message);
    }

    public static Stream<Arguments> gameFoundProvider() {
        return Stream.of(
                Arguments.arguments("Chess", "Такая игра есть в списке"),
                Arguments.arguments("Cards", "Такая игра есть в списке"),
                Arguments.arguments("Cards", "Такая игра есть в списке")
        );
    }

    @ParameterizedTest
    @MethodSource("gameFoundProvider")
    public void testSearchExistingGame(String gameName, String message) {
        BoardGame actualGame = GameRental.searchGame(gameName,gamesMap);
        assertEquals(gameName,actualGame.getName(),message);
    }
}
