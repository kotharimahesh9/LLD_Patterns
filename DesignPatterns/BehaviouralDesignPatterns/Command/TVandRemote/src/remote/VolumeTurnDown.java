package remote;

import tv.TV;

public class VolumeTurnDown implements IRemote{

    private TV tv;
    private int volume;
    public VolumeTurnDown(TV tv, int volume){
        this.tv = tv;
        this.volume = volume;
    }
    @Override
    public void execute() {
        tv.decreaseVolume(volume);
    }
}
