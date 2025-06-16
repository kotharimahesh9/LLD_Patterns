package iterator;

import Collection.Playlist;
import dto.Song;

import java.util.List;

public class ForwardIterator<T> implements Iterator{

    private final List<T> items;
    int index;
    public ForwardIterator (List<T> items){
        this.items = items;
        index = 0;
    }
    @Override
    public boolean hasNext() {
        if(index == items.size())
            return false;
        return true;
    }

    @Override
    public T next() {
        return items.get(index++);
    }
}
