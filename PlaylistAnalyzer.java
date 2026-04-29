import java.util.List;
import java.util.stream.Collectors;

// Ergänzung zum Streams verinnerlichen


public class PlaylistAnalyzer {

    // Stream = Fließband in einer Fabrik
    // Jedes Lied läuft darüber, User entscheidet, was damit passiert
    // collect() = Fließband anhalten, Ergebnis einsammeln

    // Alle Songs eines Artists
    public List<Song> filterByArtist(List<Song> songs, String artist) {
        return songs.stream()                                   // Fließband starten
                .filter(s -> s.getArtist().equals(artist))      // nur von diesem Artist
                .collect(Collectors.toList());                  // einsammeln
    }

    // nach Jahr sortieren, älteste zuerst

    public List<Song> sortByYear(List<Song> songs) {
        return songs.stream()                                                  // Fließband starten
                .sorted((a, b) -> a.getYear() - b.getYear())       // a minus b = aufsteigend
                .collect(Collectors.toList());                                 // einsammeln
        }

        // Gesamtzeit nach Album
    public int totalDurationByAlbum(List<Song> songs, String album) {
        return songs.stream()                                    // Fließband starten
                .filter(s -> s.getAlbum().equals(album))    // nach Album filtern
                .mapToInt(s -> s.getDurationSeconds())     // Song -> Sekunden
                .sum();
    }


}
