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

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameReturnTest {


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
        gamesMap.get("Chess").setRented(true);
    }

    @MethodSource("Provider")
    @ParameterizedTest
    public void testReturnGame(String name, boolean expected, String message){
        assertEquals(expected,GameRental.returnGame(gamesMap,name),message);
    }

    public static Stream<Arguments> Provider(){
        return Stream.of(
                Arguments.arguments("Monopoly", false, "Игра не ареднована"),
                Arguments.arguments("NoName", false, "Игра не существует"),
                Arguments.arguments("Chess", true, "Игра ареднована")
        );
    }
}
