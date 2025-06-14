package remote;

import tv.TV;

public class TurnOnOFFCommand implements IRemote{
    TV tv;

    public TurnOnOFFCommand(TV tv){
        this.tv = tv;
    }
    public void execute(){
        tv.turnOnTurnOff();
    }
}
