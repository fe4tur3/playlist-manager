

public class Song {

    private String title;
    private String artist;
    private String album;
    private int year;
    private int durationSeconds;

    public Song(String titel, String artist, String album, int year, int durationSeconds) {
        this.title=titel;
        this.artist=artist;
        this.album=album;
        this.year=year;
        this.durationSeconds = durationSeconds;
    }

    public String getTitle() { return title;}                   // Ansicht auf "private" Titel auch außerhalb der Klasse
    public String getArtist() {return artist;}
    public String getAlbum() {return album;}
    public int getYear() {return year;}
    public int getDurationSeconds() {return durationSeconds;}

    @Override                                                   // Kontrollfunktion/Fehlersuche
    public String toString() {                                  //  bestimmt die Darstellung der Klasse
        return year + " - " + artist +  " [" + album + "] " + ": " + title + " : " + durationSeconds/60 + ":" + String.format("%02d", durationSeconds%60) + "min" ;
    }
}
