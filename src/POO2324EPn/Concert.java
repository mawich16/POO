package POO2324EPn;

public class Concert extends Event {
    String artist;

    public Concert (String name, String artist, int duration) {
        super(name, duration);

        if (artist == null || artist.isEmpty())
        throw new IllegalArgumentException("Artist cant be null");
        this.artist=artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {

        if (artist == null || artist.isEmpty())
        throw new IllegalArgumentException("Artist cant be null");
        this.artist=artist;
    }

    public String toString() {
        return super.toString() + ", artist: " + artist;
    }

}
