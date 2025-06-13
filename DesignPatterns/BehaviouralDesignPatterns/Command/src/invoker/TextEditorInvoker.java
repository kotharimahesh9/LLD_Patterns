package invoker;

import command.ICommand;

import java.util.Stack;

public class TextEditorInvoker {

    private Stack<ICommand> history;

    public TextEditorInvoker(){
        history = new Stack<>();
    }

    public void executeCommand(ICommand command){
        command.execute();
        history.push(command);
    }

    public void undo(){
        ICommand command = history.pop();
        command.execute();
    }

}
