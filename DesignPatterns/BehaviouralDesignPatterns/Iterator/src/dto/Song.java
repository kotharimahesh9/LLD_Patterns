package dto;

public class Song {
    private final String name;
    private final long durationInMillis;


    public Song(String name, long durationInMillis){
        this.name = name;
        this.durationInMillis = durationInMillis;
    }

    public String getName(){
        return this.name;
    }

    public long getDurationInMillis(){
        return this.durationInMillis;
    }


    public String toString(){
        return "name = [" + name + "] Duration = [" + durationInMillis + "] ";
    }
}
