package alfa.lesson8;

import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<String> songs = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "name='" + name + '\'' +
                ", songs=" + songs +
                '}';
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getSongs() {
        return songs;
    }

    public boolean addSong(String song) {
        System.out.printf("Добавлена песня: %s", song);
        System.out.println();
        return songs.add(song);
    }

    public String deleteSong(int index) {
        if (index >= 0 && index < songs.size()) {
            System.out.printf("Удалена песня: %s", songs.get(index));
            System.out.println();
            return songs.remove(index);
        } else {
            System.out.println("Неверный индекс. Количество песен в плейлисте = " + songs.size());
            return"";
        }
    }

    public String updateSong(int index, String newName) {
        if (index >= 0 && index < songs.size()) {
            System.out.printf("Изменено название песни: %s " + "на: %s ", songs.get(index), newName);
            System.out.println();
            return songs.set(index, newName);
        } else {
            System.out.println("Неверный индекс. Количество песен в плейлисте = " + songs.size());
            return"";
        }
    }

    public String getSong(int index) {
        if (index >= 0 && index < songs.size()) {
            System.out.printf("Вы запросили песню: %s", songs.get(index));
            System.out.println();
            return songs.get(index);
        } else {
            System.out.println("Неверный индекс. Количество песен в плейлисте = " + songs.size());
            return"";
        }
    }
}
