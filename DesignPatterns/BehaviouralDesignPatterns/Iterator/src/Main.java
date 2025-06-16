import Collection.Playlist;
import Collection.PlaylistCollection;
import dto.Song;
import iterator.BackwardIterator;
import iterator.ForwardIterator;
import iterator.Iterator;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSongs(new Song("abc", 123423));
        playlist.addSongs(new Song("def", 12323));

        playlist.addSongs(new Song("ghi", 23423));
        playlist.addSongs(new Song("jkl", 34423));
        playlist.addSongs(new Song("mno", 93423));

        Iterator forwardIterator = playlist.createForwardIterator();
        while(forwardIterator.hasNext()){
            System.out.println(forwardIterator.next());
        }

        Iterator backwardIterator = playlist.createBackwardIterator();
        while(backwardIterator.hasNext()){
            System.out.println(backwardIterator.next());
        }
    }
}