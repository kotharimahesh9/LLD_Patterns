package iterator;

import Collection.Playlist;
import dto.Song;

import java.util.List;

public class BackwardIterator<T> implements Iterator{


    private List<T> items;
    int index;
    public BackwardIterator(List<T> items){
        this.items = items;
        index = items.size() - 1;
    }
    public boolean hasNext(){
        if(index >= 0)
            return true;
        return false;
    }

    public T next(){
        return items.get(index--);
    }
}
