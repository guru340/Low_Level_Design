package BehaviouralPattern.MementoPattern;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor=new TextEditor();
        History history=new History() ;
        textEditor.write("Hello Everyone");
        history.saveState(textEditor);
        textEditor.write("Bye");
        history.saveState(textEditor);
        history.undo(textEditor);
        // Problem-> Undo the Text

        System.out.println(textEditor.getContent());
    }
}
