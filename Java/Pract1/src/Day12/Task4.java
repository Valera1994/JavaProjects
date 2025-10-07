package Day12;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    static void main() {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("John Agutin", 45));
        members1.add(new MusicArtist("Valera Vad", 35));
        members1.add(new MusicArtist("Mon Alion", 29));
        members1.add(new MusicArtist("Jim Hendricks", 65));


        MusicBand musicBand1 = new MusicBand("Group1", 2005, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Vasya Pupkin", 45));
        members2.add(new MusicArtist("Misha Han", 35));
        members2.add(new MusicArtist("Monica Levinsky", 29));


        MusicBand musicBand2 = new MusicBand("Group2", 2008, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
