package Collection;

import dto.Song;
import iterator.BackwardIterator;
import iterator.ForwardIterator;
import iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist{
    private List<Song> songs;

    public Playlist(List<Song> songs){
        this.songs = songs;
    }

    public Playlist(){
        songs = new ArrayList<>();
    }

    public void addSongs(Song song){
        songs.add(song);
    }

    public List<Song> getSongs(){
        return this.songs;
    }

    public Iterator createForwardIterator() {
        return new ForwardIterator(songs);
    }

    public Iterator createBackwardIterator() {
        return new BackwardIterator(songs);
    }


}
