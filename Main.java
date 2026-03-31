import java.util.*;

public class Main {
    public static void main(String[] args) {
        Playlist<Song> playlist = new Playlist<>("First Playlist");
        playlist.add(new Song("Kein Signal", "Leer", "Schwarz", 2025));
        playlist.add(new Song("Rauschen", "Vegas Boyz", "Lalalala", 2013));
        playlist.add(new Song("Stille", "Schundmaul", "Single", 2025));
        playlist.add(new Song("Lalala", "Vegas Boyz", "Lalalala", 2013));
        playlist.add(new Song("Interferenzen", "Stören.Frieden", "Systemfehler", 2014));
        playlist.add(new Song("Katzengejammer", "Die müden Mäuse", "Laune der Natur", 2017));
        playlist.add(new Song("Na na na, na na na", "Digital Monsters", "Japanische Comics", 2020));
        playlist.add(new Song("Cha La La La", "Dinosaur Balls", "Japanische Comics", 2020 ));

        System.out.println("===" + playlist.getName() + "==");
        playlist.getEntries().forEach(s -> System.out.println(s));              // s = Song, "->" = mache folgendes mit "forEach"/jedem Song



    }
}