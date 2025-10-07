package Day12;

public class MusicArtist {
    private String name;
    public int year;

    public MusicArtist(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "{name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
