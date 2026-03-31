public class Song {

    private String title;
    private String artist;
    private String album;
    private int year;

    public Song(String titel, String artist, String album, int year) {
        this.title=titel;
        this.artist=artist;
        this.album=album;
        this.year=year;
    }

    public String getTitle() { return title;}                   // Ansicht auf "private" Titel auch außerhalb der Klasse
    public String getArtist() {return artist;}
    public String getAlbum() {return album;}
    public int getYear() {return year;}

    @Override                                                   // Kontrollfunktion/Fehlersuche
    public String toString() {                                  //  bestimmt die Darstellung der Klasse
        return year + " - " + artist +  " [" + album + "] " + ": " + title;
    }
}
