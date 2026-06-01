package alfa.lesson8;

import java.util.ArrayList;

public class Winamp {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("Детские песни");
        playlist.addSong("В траве сидел кузнечик");
        playlist.addSong("Песня");
        playlist.updateSong(0, "Елочка");
        playlist.updateSong(2, "В траве сидел кузнечик");
        playlist.getSong(0);
        playlist.deleteSong(0);
        System.out.println(playlist);
    }
}
