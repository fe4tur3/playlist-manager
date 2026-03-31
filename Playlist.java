import java.util.*;                                         // ArrayList; List;

public class Playlist<T> {                                  // erstmal für Songs, später mehr
    private String name;                                    // Playlist-Name
    private List<T> entries = new ArrayList<>();

    public Playlist(String name) {
        this.name=name;
    }

    public void add(T entry) {                              // fügt Eintrag ein
        entries.add(entry);
    }

    public List<T> getEntries(){                            // gibt Playlist wieder
        return entries;
    }

    public String getName(){                                // verrät den Namen der Playlist
        return name;
    }

}
