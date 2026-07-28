package alfa.lesson15;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class GameRentTest {

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

    @BeforeEach
    public void makeMonopolyFree() {
        gamesMap.get("Monopoly").setRented(false);
        gamesMap.get("Cards").setRented(false);
        gamesMap.get("Chess").setRented(true);
    }

    @MethodSource("ExceptionProvider")
    @ParameterizedTest
    public void testRentGameException(String name, int age) {
        assertThrows(IllegalArgumentException.class, () -> GameRental.rentGame(gamesMap,name, age));
    }

    public static Stream<Arguments> ExceptionProvider() {
        return Stream.of(
                Arguments.arguments("Domino", 15, "Игра уже арендована")
        );
    }

    @MethodSource("Provider")
    @ParameterizedTest
    public void testRentGame(String name, int age, boolean expected,String message) {
        assertEquals(GameRental.rentGame(gamesMap, name, age),expected, message);
    }

    public static Stream<Arguments> Provider() {
        return Stream.of(
                Arguments.arguments("Chess", 10, false, "Игра уже арендована"),
                Arguments.arguments("Monopoly", 10, true,"Аренда разрешена"),
                Arguments.arguments("Cards", 0, false,"Клиент не подходит по возрасту")
        );
    }

}
