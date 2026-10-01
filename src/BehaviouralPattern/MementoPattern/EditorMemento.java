package BehaviouralPattern.MementoPattern;
//Mementoclass: Stores the internal state of the TextEditor
public class EditorMemento {
    private final String Content;

    public EditorMemento(String content) {
        Content = content;
    }

    public String getContent(){
        return Content;
    }
}
