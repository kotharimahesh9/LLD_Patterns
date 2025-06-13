import command.DeleteCommand;
import command.ICommand;
import command.WriteCommand;
import invoker.TextEditorInvoker;
import receiver.TextEditor;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor("MK");
        TextEditorInvoker invoker = new TextEditorInvoker();
        ICommand addText = new WriteCommand(textEditor, "Hello World");
        ICommand addText1 = new WriteCommand(textEditor, "My name is Mahesh");
        invoker.executeCommand(addText);
        invoker.executeCommand(addText1);
        invoker.executeCommand(new DeleteCommand(textEditor));
        System.out.println(textEditor.getContent());

    }
}