import invoker.CommandInvoker;
import remote.ChangeChannelCommand;
import remote.TurnOnOFFCommand;
import remote.VolumeTurnDown;
import remote.VolumeTurnUp;
import tv.TV;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        CommandInvoker commandInvoker = new CommandInvoker();

        commandInvoker.executeCommand(new TurnOnOFFCommand(tv));
        commandInvoker.executeCommand(new ChangeChannelCommand(tv, "CNN"));
        commandInvoker.executeCommand(new VolumeTurnUp(tv, 10));
        commandInvoker.executeCommand(new VolumeTurnDown(tv, 10));
        commandInvoker.executeCommand(new TurnOnOFFCommand(tv));

    }
}