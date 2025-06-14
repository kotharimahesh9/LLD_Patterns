package remote;

import tv.TV;

public class VolumeTurnUp implements IRemote{

    private TV tv;
    private int volume;
    public VolumeTurnUp(TV tv, int volume){
        this.tv = tv;
        this.volume = volume;
    }
    @Override
    public void execute() {
        tv.increaseVolume(volume);
    }
}
