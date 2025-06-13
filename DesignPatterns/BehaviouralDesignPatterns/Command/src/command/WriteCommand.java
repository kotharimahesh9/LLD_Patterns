package command;

import receiver.TextEditor;

public class WriteCommand implements ICommand{
    TextEditor textEditor;
    String text;

    public WriteCommand(TextEditor textEditor, String text){
        this.textEditor = textEditor;
        this.text = text;
    }

    @Override
    public void execute() {
        textEditor.addText(text);
    }

    @Override
    public void undo() {
        int n = text.length();
        while(n > 0){
            textEditor.deleteText();
            n--;
        }
    }
}
