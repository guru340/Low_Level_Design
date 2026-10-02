package BehaviouralPattern.CommandPattern;


class TextEditor{
    public void bold(){
        System.out.println("Text are became Bold");
    }

    public void italic(){
        System.out.println("Text are became italic");
    }

    public void underlined(){
        System.out.println("Text are became underlined");
    }
}

class BoldButton{
    private TextEditor textEditor;

    public BoldButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void click(){
        textEditor.bold();
    }
}

class ItalicButton {
    private TextEditor textEditor;

    public ItalicButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void click() {
        textEditor.italic();
    }

}
public class WithoutCommandPattern {
    public static void main(String[] args) {
        TextEditor textEditor=new TextEditor();
        BoldButton boldButton=new BoldButton(textEditor);
        ItalicButton italicButton=new ItalicButton(textEditor);
        boldButton.click();
        italicButton.click();
    }
    }

