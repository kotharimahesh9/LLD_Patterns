package remote;

import tv.TV;

public class ChangeChannelCommand implements IRemote{
    private TV tv;
    private String channel;

    public ChangeChannelCommand(TV tv, String channel){
        this.tv = tv;
        this.channel = channel;
    }
    public void execute(){
        tv.setChannel(channel);
    }
}
