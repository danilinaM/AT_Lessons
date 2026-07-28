package alfa.lesson15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GameRental {

    public void setMap(Map<String, BoardGame> map) {
        this.map = map;
    }

    private ArrayList<BoardGame> boardGames = new ArrayList<>();
    private static Map<String, BoardGame> map = new HashMap<>();

    public GameRental(Map<String, BoardGame> map) {
        this.map = map;
    }

    public GameRental(ArrayList<BoardGame> boardGames) {
        this.boardGames = boardGames;
    }

    public void setBoardGames(ArrayList<BoardGame> boardGames) {
        this.boardGames = boardGames;
    }

    public ArrayList<BoardGame> getBoardGames() {
        return boardGames;
    }

    public boolean addGame(BoardGame boardGame) {
        if (boardGame == null) {
            throw new IllegalArgumentException("Game cant be null");
        }
        for (BoardGame b : boardGames) {
            if (b.getName().equals(boardGame.getName())) {
                throw new IllegalArgumentException("This game name already exists in list");
            }
        }
        if (boardGame.getName().isEmpty() || boardGame.getName() == null) {
            return false;
        }
        if (boardGame.getMinAge() < 0) {
            return false;
        }
        if (boardGame.getRentPrice() <= 0) {
            return false;
        }
        boardGames.add(boardGame);
        return true;
    }

    public static BoardGame searchGame(String name, Map<String, BoardGame> mapBoardGame) {
        return mapBoardGame.get(name);
    }

    public static boolean rentGame(Map<String, BoardGame> mapBoardGame, String name, int customerAge) {
        BoardGame game = mapBoardGame.get(name);
        if (game == null) {
            throw new IllegalArgumentException();
        }
        if (game.isRented()) {
            return false;
        }
        if (customerAge < game.getMinAge()) {
            return false;
        }
        game.setRented(true);
        return true;
    }

    public static boolean returnGame(Map<String, BoardGame> map, String name) {
        if (map.get(name) == null) {
            return false;
        }
        if (!map.get(name).isRented()) {
            return false;
        }
        map.get(name).setRented(false);
        return true;
    }

    public static int calculateCost(String name, int days) {
        if (map.get(name) == null || days <= 0) {
            throw new IllegalArgumentException();
        }
        return map.get(name).getRentPrice() * days;
    }
}
