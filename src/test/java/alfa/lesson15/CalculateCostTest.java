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
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculateCostTest {

    static Map<String, BoardGame> gamesMap = new HashMap<>();
    GameRental gameRental = new GameRental(gamesMap);

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

    @MethodSource("ProviderError")
    @ParameterizedTest
    public void testCalculateCostError(String name, int days, String message) {
        assertThrows(IllegalArgumentException.class, () -> GameRental.calculateCost(name, days), message);
    }

    public static Stream<Arguments> ProviderError() {
        return Stream.of(
                Arguments.arguments("Noname", 1, "Игра не существует"),
                Arguments.arguments("Monopoly", 0, "Количество дней <=0"),
                Arguments.arguments("Monopoly", -10, "Количество дней <=0")
        );
    }

    @MethodSource("Provider")
    @ParameterizedTest
    public void testCalculateCost(String name, int days, String message) {
        int expected = days * gamesMap.get(name).getRentPrice() ;
        assertEquals(expected, GameRental.calculateCost(name, days), message);
    }

    public static Stream<Arguments> Provider() {
        return Stream.of(
                Arguments.arguments("Cards", 1, "Стоимость игры = 200"),
                Arguments.arguments("Monopoly", 10, "Стоимость игры = 20000"),
                Arguments.arguments("Chess", 2, "Стоимость игры = 20000")
        );
    }
}
