package receiver;

public class TextEditor {

    private StringBuilder content;
    private String name;

    public TextEditor(String name){
        this.name = name;
        content = new StringBuilder();
    }

    public void addText(String text){
        this.content.append(text);
        System.out.println("Text added successfully");
    }

    public String deleteText(){
        char lastChar = this.content.charAt(this.content.length() - 1);
        this.content.deleteCharAt(this.content.length() - 1);
        System.out.println("Last character deleted Successfully");
        return lastChar+"";
    }

    public String getContent(){
        return content.toString();
    }




}
