package invoker;

import remote.IRemote;

public class CommandInvoker {

    public void executeCommand(IRemote command){
        command.execute();
    }
}
