import java.util.*;

public class Main {
    public static void main(String[] args) {
        Playlist<Song> playlist = new Playlist<>("First Playlist");
        playlist.add(new Song("Kein Signal", "Leer", "Schwarz", 2025, 360));
        playlist.add(new Song("Rauschen", "Vegas Boyz", "Lalalala", 2013, 217));
        playlist.add(new Song("Stille", "Schundmaul", "Single", 2025, 188));
        playlist.add(new Song("Lalala", "Vegas Boyz", "Lalalala", 2013, 521));
        playlist.add(new Song("Interferenzen", "Stören.Frieden", "Systemfehler", 2014, 165));
        playlist.add(new Song("Katzengejammer", "Die müden Mäuse", "Laune der Natur", 2017, 180));
        playlist.add(new Song("Na na na, na na na", "Digital Monsters", "Japanische Comics", 2020, 207));
        playlist.add(new Song("Cha La La La", "Dinosaur Balls", "Japanische Comics", 2020, 138));

        System.out.println("\n===" + playlist.getName() + "===");
        playlist.getEntries().forEach(s -> System.out.println(s));              // s = Song, "->" = mache folgendes mit "forEach"/jedem Song

        PlaylistAnalyzer analyzer = new PlaylistAnalyzer();
        List<Song> songs = playlist.getEntries();

        System.out.println("\n == Sort by Year == \n");
        analyzer.sortByYear(songs).forEach(s -> System.out.println(s));

        System.out.println("\n ::: Vegas Boys only :::\n");
        analyzer.filterByArtist(songs, "Vegas Boyz").forEach(s -> System.out.println(s));

        int albumSekunden = analyzer.totalDurationByAlbum(songs, "Lalalala");
        System.out.println("Albumlänge Lalalala: " + albumSekunden/60 + ":" + String.format("%02d", albumSekunden%60) + " min");



    }
}