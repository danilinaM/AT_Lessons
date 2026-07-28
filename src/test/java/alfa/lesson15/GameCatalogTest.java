package alfa.lesson15;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GameCatalogTest {

    static ArrayList<BoardGame> arrayList = new ArrayList<>();
    GameRental gameRental = new GameRental(arrayList);
    static int arraySize;

    @BeforeAll
    public static void fillArray() {
        arrayList.add(new BoardGame("Monopoly", 5, 2000));
        arrayList.add(new BoardGame("Cards", 50, 200));
        arrayList.add(new BoardGame("Chess", 12, 10000));
        arraySize = arrayList.size();
    }

    @AfterAll
    public static void clearArray() {
        arrayList.clear();
    }

    @AfterEach
    public void clearAddedElement() {
        if (arrayList.size() != arraySize) {
            arrayList.removeLast();
        }
    }

    public static Stream<Arguments> gameProvider() {
        return Stream.of(
                Arguments.arguments(new BoardGame("Catan", 10, 1000), true, "При валидных данных игра должна быть добавлена"),
                Arguments.arguments(new BoardGame("Hide-and-seak", 0, 1000), true, "При валидных данных игра должна быть добавлена"),
                Arguments.arguments(new BoardGame("Domino", -1, 1000), false, "Возраст не может быть отрицательным"),
                Arguments.arguments(new BoardGame("Victims", 1000, -1000), false, "Цена не может быть отрицательной")
        );
    }

    @ParameterizedTest
    @MethodSource("gameProvider")
    public void testAddGame(BoardGame game, Boolean expectedGameAdded, String assertErrorMessage) {
        Boolean actualGameAdded = gameRental.addGame(game);
        assertEquals(expectedGameAdded, actualGameAdded, assertErrorMessage);
    }

    public static Stream<Arguments> gameExceptionProvider() {
        return Stream.of(
                Arguments.arguments(new BoardGame("Monopoly", 10, 1000)),
                Arguments.arguments((BoardGame) null)
        );
    }

    @ParameterizedTest
    @MethodSource("gameExceptionProvider")
    public void testAddGameException(BoardGame game) {
        assertThrows(IllegalArgumentException.class, () -> gameRental.addGame(game));
    }
}
