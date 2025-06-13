package command;

import receiver.TextEditor;

public class DeleteCommand implements ICommand{
    TextEditor textEditor;
    private String deletedText = "";

    public DeleteCommand(TextEditor textEditor){
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        deletedText = textEditor.deleteText();
    }

    @Override
    public void undo() {
        textEditor.addText(deletedText);
    }
}
